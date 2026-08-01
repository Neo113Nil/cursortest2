package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public abstract class Ph extends AbstractC3749gq {
    public final AdConfig.ViewabilityConfig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ph(AdConfig.ViewabilityConfig viewabilityConfig, byte b, Y9 y9) {
        super(new WeakHashMap(10), new Handler(Looper.getMainLooper()), b, y9);
        Q7 visibilityChecker = T7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.l = viewabilityConfig;
    }

    @Override // com.inmobi.media.AbstractC3749gq
    public final void d() {
        Job launch$default;
        String str = "onPostVisibilityCheck " + this;
        if (this.j || this.g.get()) {
            return;
        }
        this.j = true;
        launch$default = BuildersKt__Builders_commonKt.launch$default(AbstractC3904ma.e, null, null, new C3721fq(new WeakReference(this), null), 3, null);
        this.k = launch$default;
    }
}
