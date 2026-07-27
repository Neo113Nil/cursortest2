package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import com.onesignal.core.internal.config.ConfigModelStoreKt;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D fromBundle(Bundle bundle) {
        bundle.setClassLoader(D.class.getClassLoader());
        D d6 = (D) bundle.getParcelable(ConfigModelStoreKt.CONFIG_NAME_SPACE);
        return d6 == null ? new D(new j0()) : d6;
    }
}
