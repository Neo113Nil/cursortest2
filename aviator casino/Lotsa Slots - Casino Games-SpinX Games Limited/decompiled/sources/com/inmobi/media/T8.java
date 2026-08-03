package com.inmobi.media;

/* loaded from: classes5.dex */
public final class T8 extends android.view.OrientationEventListener {
    public static final /* synthetic */ kotlin.reflect.KProperty[] d = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.inmobi.media.T8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.ads.rendering.InMobiAdActivity f4972a;
    public final java.util.HashSet b;
    public final com.inmobi.media.S8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T8(com.inmobi.ads.rendering.InMobiAdActivity activity) {
        super(activity);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f4972a = activity;
        this.b = new java.util.HashSet();
        kotlin.properties.Delegates delegates = kotlin.properties.Delegates.INSTANCE;
        this.c = new com.inmobi.media.S8(com.inmobi.media.Mf.a(com.inmobi.media.N5.g()), this);
    }

    public final void a(com.inmobi.media.Nf orientationProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(orientationProperties, "orientationProperties");
        try {
            if (orientationProperties.f4857a) {
                this.f4972a.setRequestedOrientation(13);
                return;
            }
            java.lang.String str = orientationProperties.b;
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, "landscape")) {
                this.f4972a.setRequestedOrientation(6);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, "portrait")) {
                this.f4972a.setRequestedOrientation(7);
            } else {
                this.f4972a.setRequestedOrientation(13);
            }
        } catch (java.lang.IllegalStateException unused) {
        }
    }

    public final void b() {
        int i = this.f4972a.getResources().getConfiguration().orientation;
        byte g = com.inmobi.media.N5.g();
        int i2 = 1;
        if (g != 1 && g != 2 && (g == 3 || g == 4)) {
            i2 = 2;
        }
        if (i == i2) {
            this.c.setValue(this, d[0], com.inmobi.media.Mf.a(com.inmobi.media.N5.g()));
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
