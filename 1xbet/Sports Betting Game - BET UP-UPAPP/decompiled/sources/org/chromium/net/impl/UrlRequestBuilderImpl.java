package org.chromium.net.impl;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public class UrlRequestBuilderImpl extends ExperimentalUrlRequest.Builder {
    private static final String ACCEPT_ENCODING = "Accept-Encoding";
    private static final String TAG = "UrlRequestBuilderImpl";
    private boolean mAllowDirectExecutor;
    private final UrlRequest.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private ByteBuffer mDictionary;
    private byte[] mDictionarySha256Hash;
    private boolean mDisableCache;
    private boolean mDisableConnectionMigration;
    private final Executor mExecutor;
    private String mMethod;
    private Collection<Object> mRequestAnnotations;
    private RequestFinishedInfo.Listener mRequestFinishedListener;
    private int mTrafficStatsTag;
    private boolean mTrafficStatsTagSet;
    private int mTrafficStatsUid;
    private boolean mTrafficStatsUidSet;
    private UploadDataProvider mUploadDataProvider;
    private Executor mUploadDataProviderExecutor;
    private final String mUrl;
    private final ArrayList<Map.Entry<String, String>> mRequestHeaders = new ArrayList<>();
    private int mPriority = 3;
    private String mDictionaryId = "";
    private long mNetworkHandle = -1;
    private int mIdempotency = 0;

    UrlRequestBuilderImpl(String url, UrlRequest.Callback callback, Executor executor, CronetEngineBase cronetEngine) {
        this.mUrl = (String) Objects.requireNonNull(url, "URL is required.");
        this.mCallback = (UrlRequest.Callback) Objects.requireNonNull(callback, "Callback is required.");
        this.mExecutor = (Executor) Objects.requireNonNull(executor, "Executor is required.");
        this.mCronetEngine = (CronetEngineBase) Objects.requireNonNull(cronetEngine, "CronetEngine is required.");
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public ExperimentalUrlRequest.Builder setHttpMethod(String method) {
        this.mMethod = (String) Objects.requireNonNull(method, "Method is required.");
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl addHeader(String header, String value) {
        Objects.requireNonNull(header, "Invalid header name.");
        Objects.requireNonNull(value, "Invalid header value.");
        if ("Accept-Encoding".equalsIgnoreCase(header)) {
            String str = TAG;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
            }
            return this;
        }
        this.mRequestHeaders.add(new AbstractMap.SimpleEntry(header, value));
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl disableCache() {
        this.mDisableCache = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl disableConnectionMigration() {
        this.mDisableConnectionMigration = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setPriority(int priority) {
        this.mPriority = priority;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public UrlRequestBuilderImpl setIdempotency(int idempotency) {
        this.mIdempotency = idempotency;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        this.mUploadDataProvider = (UploadDataProvider) Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.mUploadDataProviderExecutor = (Executor) Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        if (this.mMethod == null) {
            this.mMethod = "POST";
        }
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl allowDirectExecutor() {
        this.mAllowDirectExecutor = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl addRequestAnnotation(Object annotation) {
        Objects.requireNonNull(annotation, "Invalid metrics annotation.");
        if (this.mRequestAnnotations == null) {
            this.mRequestAnnotations = new ArrayList();
        }
        this.mRequestAnnotations.add(annotation);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setTrafficStatsTag(int tag) {
        this.mTrafficStatsTagSet = true;
        this.mTrafficStatsTag = tag;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setTrafficStatsUid(int uid) {
        this.mTrafficStatsUidSet = true;
        this.mTrafficStatsUid = uid;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.mRequestFinishedListener = listener;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl setRawCompressionDictionary(byte[] dictionarySha256Hash, ByteBuffer dictionary, String dictionaryId) {
        this.mDictionarySha256Hash = (byte[]) Objects.requireNonNull(dictionarySha256Hash, "Hash is required");
        if (dictionarySha256Hash.length != 32) {
            throw new IllegalArgumentException("SHA-256 hashes are supposed to be 32 bytes");
        }
        this.mDictionary = (ByteBuffer) Objects.requireNonNull(dictionary, "Dictionary is required");
        Preconditions.checkDirect(dictionary);
        this.mDictionaryId = (String) Objects.requireNonNull(dictionaryId, "Dictionary ID cannot be null. If missing, pass an empty string");
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public UrlRequestBuilderImpl bindToNetwork(long networkHandle) {
        this.mNetworkHandle = networkHandle;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public ExperimentalUrlRequest build() {
        CronetEngineBase cronetEngineBase = this.mCronetEngine;
        String str = this.mUrl;
        UrlRequest.Callback callback = this.mCallback;
        Executor executor = this.mExecutor;
        int i = this.mPriority;
        Collection<Object> collection = this.mRequestAnnotations;
        boolean z = this.mDisableCache;
        boolean z2 = this.mDisableConnectionMigration;
        boolean z3 = this.mAllowDirectExecutor;
        boolean z4 = this.mTrafficStatsTagSet;
        int i2 = this.mTrafficStatsTag;
        boolean z5 = this.mTrafficStatsUidSet;
        int i3 = this.mTrafficStatsUid;
        RequestFinishedInfo.Listener listener = this.mRequestFinishedListener;
        int i4 = this.mIdempotency;
        long j = this.mNetworkHandle;
        String str2 = this.mMethod;
        if (str2 == null) {
            str2 = "GET";
        }
        return cronetEngineBase.createRequest(str, callback, executor, i, collection, z, z2, z3, z4, i2, z5, i3, listener, i4, j, str2, this.mRequestHeaders, this.mUploadDataProvider, this.mUploadDataProviderExecutor, this.mDictionarySha256Hash, this.mDictionary, this.mDictionaryId);
    }
}
