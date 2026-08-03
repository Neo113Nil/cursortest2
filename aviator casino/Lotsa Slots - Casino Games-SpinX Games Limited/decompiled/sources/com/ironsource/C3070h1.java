package com.ironsource;

/* renamed from: com.ironsource.h1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3070h1 {
    public static final com.ironsource.C3070h1.a b = new com.ironsource.C3070h1.a(null);
    private static final int c = -1;

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3158m0 f6280a;

    /* renamed from: com.ironsource.h1$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.ironsource.h1$b */
    public static final class b<T> implements java.util.Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t2).getWidth()), java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t).getWidth()));
        }
    }

    /* renamed from: com.ironsource.h1$c */
    public static final class c<T> implements java.util.Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.Comparator f6281a;

        public c(java.util.Comparator comparator) {
            this.f6281a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compare = this.f6281a.compare(t, t2);
            return compare != 0 ? compare : kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t2).getHeight()), java.lang.Integer.valueOf(((com.unity3d.mediation.LevelPlayAdSize) t).getHeight()));
        }
    }

    public C3070h1(com.ironsource.C3158m0 adSizeTools) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.f6280a = adSizeTools;
    }

    public final com.unity3d.mediation.LevelPlayAdSize a(android.content.Context context, java.lang.Integer num) {
        int i;
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f6280a.d()) {
            com.ironsource.mediationsdk.logger.IronLog.API.error(com.ironsource.C3158m0.a(this.f6280a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (java.lang.String) null, 2, (java.lang.Object) null));
            return null;
        }
        java.lang.Integer b2 = this.f6280a.b(context);
        if (b2 == null) {
            com.ironsource.mediationsdk.logger.IronLog.API.error(com.ironsource.C3158m0.a(this.f6280a, "Error getting max current orientation banner height", (java.lang.String) null, 2, (java.lang.Object) null));
            return null;
        }
        int intValue = b2.intValue();
        int a2 = a(num, context);
        int a3 = this.f6280a.a(a2);
        java.util.List<com.unity3d.mediation.LevelPlayAdSize> a4 = a();
        for (com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize2 : a(a4, intValue, a2)) {
            if (levelPlayAdSize2.getWidth() <= a2 && (levelPlayAdSize2.getHeight() <= a3 || a3 == -1)) {
                a3 = java.lang.Math.max(a3, levelPlayAdSize2.getHeight());
                break;
            }
        }
        levelPlayAdSize2 = null;
        if (levelPlayAdSize2 == null) {
            int height = ((com.unity3d.mediation.LevelPlayAdSize) kotlin.collections.CollectionsKt.last((java.util.List) a4)).getHeight();
            i = height;
            levelPlayAdSize = com.unity3d.mediation.LevelPlayAdSize.Companion.createCustomSize(a2, height);
        } else {
            i = a3;
            levelPlayAdSize = levelPlayAdSize2;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.info(com.ironsource.C3158m0.a(this.f6280a, "Adaptive: " + a2 + "x" + i + " Fallback: " + levelPlayAdSize, (java.lang.String) null, 2, (java.lang.Object) null));
        return new com.unity3d.mediation.LevelPlayAdSize(a2, i, com.ironsource.mediationsdk.j.f, true, levelPlayAdSize);
    }

    private final int a(java.lang.Integer num, android.content.Context context) {
        if (num != null && num.intValue() < 0) {
            com.ironsource.mediationsdk.logger.IronLog.API.info(com.ironsource.C3158m0.a(this.f6280a, "Width is invalid, screen width will be used", (java.lang.String) null, 2, (java.lang.Object) null));
            return com.ironsource.Z4.f6111a.b(context);
        }
        if (num == null) {
            return com.ironsource.Z4.f6111a.b(context);
        }
        return num.intValue();
    }

    private final java.util.List<com.unity3d.mediation.LevelPlayAdSize> a() {
        return kotlin.collections.CollectionsKt.sortedWith(this.f6280a.b(), new com.ironsource.C3070h1.c(new com.ironsource.C3070h1.b()));
    }

    private final java.util.List<com.unity3d.mediation.LevelPlayAdSize> a(java.util.List<com.unity3d.mediation.LevelPlayAdSize> list, int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = (com.unity3d.mediation.LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i && levelPlayAdSize.getWidth() <= i2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
