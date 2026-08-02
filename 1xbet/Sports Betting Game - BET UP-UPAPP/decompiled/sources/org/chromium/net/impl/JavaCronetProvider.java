package org.chromium.net.impl;

import android.content.Context;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes4.dex */
public class JavaCronetProvider extends CronetProvider {
    public static final String FORCE_HTTPENGINE_FLAG = "Cronet_ForceHttpEngineInFallback";

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }

    public JavaCronetProvider(Context context) {
        super(context);
    }

    private boolean shouldUseHttpEngine() {
        ResolvedFlags.Value value;
        return HttpEngineNativeProvider.isHttpEngineAvailable() && (value = HttpFlagsForImpl.getHttpFlags(this.mContext, CronetLogger.CronetSource.CRONET_SOURCE_FALLBACK).flags().get(FORCE_HTTPENGINE_FLAG)) != null && value.getBoolValue();
    }

    @Override // org.chromium.net.CronetProvider
    public CronetEngine.Builder createBuilder() {
        if (shouldUseHttpEngine()) {
            return new HttpEngineNativeProvider(this.mContext).createBuilder();
        }
        return new ExperimentalCronetEngine.Builder(new JavaCronetEngineBuilderImpl(this.mContext));
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return CronetProvider.PROVIDER_NAME_FALLBACK;
    }

    @Override // org.chromium.net.CronetProvider
    public String getVersion() {
        return ImplVersion.getCronetVersion();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{JavaCronetProvider.class, this.mContext});
    }

    public boolean equals(Object other) {
        return other == this || ((other instanceof JavaCronetProvider) && this.mContext.equals(((JavaCronetProvider) other).mContext));
    }
}
