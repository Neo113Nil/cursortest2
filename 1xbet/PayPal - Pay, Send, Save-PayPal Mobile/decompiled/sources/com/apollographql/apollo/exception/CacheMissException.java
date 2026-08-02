package com.apollographql.apollo.exception;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/exception/CacheMissException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "key", "fieldName", "", "stale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getFieldName", "Z", "getStale", "()Z", "getStale$annotations", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CacheMissException extends com.apollographql.apollo.exception.ApolloException {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.apollographql.apollo.exception.CacheMissException.Companion INSTANCE = new com.apollographql.apollo.exception.CacheMissException.Companion(null);
    private final java.lang.String fieldName;
    private final java.lang.String key;
    private final boolean stale;

    public static /* synthetic */ void getStale$annotations() {
    }

    public /* synthetic */ CacheMissException(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final java.lang.String getFieldName() {
        return this.fieldName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheMissException(java.lang.String str, java.lang.String str2, boolean z) {
        super(INSTANCE.message$apollo_api(str, str2, z), null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.fieldName = str2;
        this.stale = z;
    }

    public final boolean getStale() {
        return this.stale;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CacheMissException(java.lang.String str, java.lang.String str2) {
        this(str, str2, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/apollographql/apollo/exception/CacheMissException$Companion;", "", "<init>", "()V", "", "cacheKey", "fieldKey", "", "stale", "message$apollo_api", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String message$apollo_api(java.lang.String cacheKey, java.lang.String fieldKey, boolean stale) {
            if (fieldKey == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Object '");
                sb.append(cacheKey);
                sb.append("' not found");
                return sb.toString();
            }
            if (stale) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Field '");
                sb2.append(fieldKey);
                sb2.append("' on object '");
                sb2.append(cacheKey);
                sb2.append("' is stale");
                return sb2.toString();
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Object '");
            sb3.append(cacheKey);
            sb3.append("' has no field named '");
            sb3.append(fieldKey);
            sb3.append('\'');
            return sb3.toString();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
