package com.facebook;

/* compiled from: GraphRequestBatch.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003;<=B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0015\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0002\u0010\tJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020+2\u0006\u0010,\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0002H\u0016J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0018J\b\u0010/\u001a\u00020+H\u0016J\f\u00100\u001a\b\u0012\u0004\u0012\u00020201J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020201H\u0002J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000205H\u0002J\u0011\u00107\u001a\u00020\u00022\u0006\u0010,\u001a\u00020 H\u0096\u0002J\u0010\u00108\u001a\u00020\u00022\u0006\u0010,\u001a\u00020 H\u0016J\u000e\u00109\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0018J\u0019\u0010:\u001a\u00020\u00022\u0006\u0010,\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0002H\u0096\u0002R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R$\u0010$\u001a\u00020 2\u0006\u0010#\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'R\u000e\u0010#\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/facebook/GraphRequestBatch;", "Ljava/util/AbstractList;", "Lcom/facebook/GraphRequest;", "()V", "requests", "", "(Ljava/util/Collection;)V", "", "([Lcom/facebook/GraphRequest;)V", "(Lcom/facebook/GraphRequestBatch;)V", "batchApplicationId", "", "getBatchApplicationId", "()Ljava/lang/String;", "setBatchApplicationId", "(Ljava/lang/String;)V", "callbackHandler", "Landroid/os/Handler;", "getCallbackHandler", "()Landroid/os/Handler;", "setCallbackHandler", "(Landroid/os/Handler;)V", "<set-?>", "", "Lcom/facebook/GraphRequestBatch$Callback;", "callbacks", "getCallbacks", "()Ljava/util/List;", "id", "getId", "getRequests", "size", "", "getSize", "()I", "timeoutInMilliseconds", "timeout", "getTimeout", "setTimeout", "(I)V", "add", "", "element", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "addCallback", "callback", "clear", "executeAndWait", "", "Lcom/facebook/GraphResponse;", "executeAndWaitImpl", "executeAsync", "Lcom/facebook/GraphRequestAsyncTask;", "executeAsyncImpl", "get", "removeAt", "removeCallback", "set", "Callback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "OnProgressCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphRequestBatch extends java.util.AbstractList<com.facebook.GraphRequest> {
    private static final java.util.concurrent.atomic.AtomicInteger idGenerator = new java.util.concurrent.atomic.AtomicInteger();
    private java.lang.String batchApplicationId;
    private android.os.Handler callbackHandler;
    private java.util.List<com.facebook.GraphRequestBatch.Callback> callbacks;
    private final java.lang.String id;
    private java.util.List<com.facebook.GraphRequest> requests;
    private int timeoutInMilliseconds;

    /* compiled from: GraphRequestBatch.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequestBatch$Callback;", "", "onBatchCompleted", "", "batch", "Lcom/facebook/GraphRequestBatch;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onBatchCompleted(com.facebook.GraphRequestBatch batch);
    }

    /* compiled from: GraphRequestBatch.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/facebook/GraphRequestBatch$OnProgressCallback;", "Lcom/facebook/GraphRequestBatch$Callback;", "onBatchProgress", "", "batch", "Lcom/facebook/GraphRequestBatch;", "current", "", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnProgressCallback extends com.facebook.GraphRequestBatch.Callback {
        void onBatchProgress(com.facebook.GraphRequestBatch batch, long current, long max);
    }

    public /* bridge */ boolean contains(com.facebook.GraphRequest graphRequest) {
        return super.contains((java.lang.Object) graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj == null || (obj instanceof com.facebook.GraphRequest)) {
            return contains((com.facebook.GraphRequest) obj);
        }
        return false;
    }

    public /* bridge */ int indexOf(com.facebook.GraphRequest graphRequest) {
        return super.indexOf((java.lang.Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj == null || (obj instanceof com.facebook.GraphRequest)) {
            return indexOf((com.facebook.GraphRequest) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(com.facebook.GraphRequest graphRequest) {
        return super.lastIndexOf((java.lang.Object) graphRequest);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj == null || (obj instanceof com.facebook.GraphRequest)) {
            return lastIndexOf((com.facebook.GraphRequest) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ com.facebook.GraphRequest remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(com.facebook.GraphRequest graphRequest) {
        return super.remove((java.lang.Object) graphRequest);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj == null || (obj instanceof com.facebook.GraphRequest)) {
            return remove((com.facebook.GraphRequest) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final android.os.Handler getCallbackHandler() {
        return this.callbackHandler;
    }

    public final void setCallbackHandler(android.os.Handler handler) {
        this.callbackHandler = handler;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.List<com.facebook.GraphRequest> getRequests() {
        return this.requests;
    }

    public final java.util.List<com.facebook.GraphRequestBatch.Callback> getCallbacks() {
        return this.callbacks;
    }

    /* renamed from: getTimeout, reason: from getter */
    public final int getTimeoutInMilliseconds() {
        return this.timeoutInMilliseconds;
    }

    public final void setTimeout(int i) {
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.".toString());
        }
        this.timeoutInMilliseconds = i;
    }

    public final java.lang.String getBatchApplicationId() {
        return this.batchApplicationId;
    }

    public final void setBatchApplicationId(java.lang.String str) {
        this.batchApplicationId = str;
    }

    public GraphRequestBatch() {
        this.id = java.lang.String.valueOf(java.lang.Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new java.util.ArrayList();
        this.requests = new java.util.ArrayList();
    }

    public GraphRequestBatch(java.util.Collection<com.facebook.GraphRequest> requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
        this.id = java.lang.String.valueOf(java.lang.Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new java.util.ArrayList();
        this.requests = new java.util.ArrayList(requests);
    }

    public GraphRequestBatch(com.facebook.GraphRequest... requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
        this.id = java.lang.String.valueOf(java.lang.Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new java.util.ArrayList();
        this.requests = new java.util.ArrayList(kotlin.collections.ArraysKt.asList(requests));
    }

    public GraphRequestBatch(com.facebook.GraphRequestBatch requests) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
        this.id = java.lang.String.valueOf(java.lang.Integer.valueOf(idGenerator.incrementAndGet()));
        this.callbacks = new java.util.ArrayList();
        this.requests = new java.util.ArrayList(requests);
        this.callbackHandler = requests.callbackHandler;
        this.timeoutInMilliseconds = requests.timeoutInMilliseconds;
        this.callbacks = new java.util.ArrayList(requests.callbacks);
    }

    public final void addCallback(com.facebook.GraphRequestBatch.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.callbacks.contains(callback)) {
            return;
        }
        this.callbacks.add(callback);
    }

    public final void removeCallback(com.facebook.GraphRequestBatch.Callback callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbacks.remove(callback);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(com.facebook.GraphRequest element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        return this.requests.add(element);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, com.facebook.GraphRequest element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        this.requests.add(index, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.requests.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public com.facebook.GraphRequest get(int index) {
        return this.requests.get(index);
    }

    public com.facebook.GraphRequest removeAt(int index) {
        return this.requests.remove(index);
    }

    @Override // java.util.AbstractList, java.util.List
    public com.facebook.GraphRequest set(int index, com.facebook.GraphRequest element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        return this.requests.set(index, element);
    }

    public int getSize() {
        return this.requests.size();
    }

    public final java.util.List<com.facebook.GraphResponse> executeAndWait() {
        return executeAndWaitImpl();
    }

    public final com.facebook.GraphRequestAsyncTask executeAsync() {
        return executeAsyncImpl();
    }

    private final java.util.List<com.facebook.GraphResponse> executeAndWaitImpl() {
        return com.facebook.GraphRequest.INSTANCE.executeBatchAndWait(this);
    }

    private final com.facebook.GraphRequestAsyncTask executeAsyncImpl() {
        return com.facebook.GraphRequest.INSTANCE.executeBatchAsync(this);
    }
}
