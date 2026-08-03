package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlayInitRequest {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8039a;
    private final java.lang.String b;
    private final java.util.List<com.unity3d.mediation.LevelPlay.AdFormat> c;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final java.lang.String f8040a;
        private java.lang.String b;

        public Builder(java.lang.String appKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f8040a = appKey;
        }

        public final com.unity3d.mediation.LevelPlayInitRequest build() {
            return new com.unity3d.mediation.LevelPlayInitRequest(this.f8040a, this.b, null, 4, null);
        }

        public final java.lang.String getAppKey() {
            return this.f8040a;
        }

        public final com.unity3d.mediation.LevelPlayInitRequest.Builder withUserId(java.lang.String userId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userId, "userId");
            this.b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(java.lang.String str, java.lang.String str2, java.util.List<? extends com.unity3d.mediation.LevelPlay.AdFormat> list) {
        this.f8039a = str;
        this.b = str2;
        this.c = list;
    }

    public final java.lang.String getAppKey() {
        return this.f8039a;
    }

    public final java.util.List<com.unity3d.mediation.LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.c;
    }

    public final java.lang.String getUserId() {
        return this.b;
    }

    /* synthetic */ LevelPlayInitRequest(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }
}
