package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.U3;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4210x9 extends OrientationEventListener {
    public static final /* synthetic */ KProperty[] d = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C4210x9.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final InMobiAdActivity f7473a;
    public final HashSet b;
    public final C4183w9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4210x9(InMobiAdActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f7473a = activity;
        this.b = new HashSet();
        Delegates delegates = Delegates.INSTANCE;
        this.c = new C4183w9(Ig.a(AbstractC3841k6.g()), this);
    }

    public final void a(Jg orientationProperties) {
        Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f6652a) {
                this.f7473a.setRequestedOrientation(13);
                return;
            }
            String str = orientationProperties.b;
            if (Intrinsics.areEqual(str, U3.i.C)) {
                this.f7473a.setRequestedOrientation(6);
            } else if (Intrinsics.areEqual(str, U3.i.D)) {
                this.f7473a.setRequestedOrientation(7);
            } else {
                this.f7473a.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i = this.f7473a.getResources().getConfiguration().orientation;
        byte g = AbstractC3841k6.g();
        int i2 = 1;
        if (g != 1 && g != 2 && (g == 3 || g == 4)) {
            i2 = 2;
        }
        if (i == i2) {
            this.c.setValue(this, d[0], Ig.a(AbstractC3841k6.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        b();
    }

    public final void a() {
        if (this.b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
