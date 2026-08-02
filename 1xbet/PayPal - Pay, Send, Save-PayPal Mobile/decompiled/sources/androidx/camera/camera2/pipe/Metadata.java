package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\nJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata;", "", "T", "Landroidx/camera/camera2/pipe/Metadata$Key;", "key", "get", "(Landroidx/camera/camera2/pipe/Metadata$Key;)Ljava/lang/Object;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT, "getOrDefault", "(Landroidx/camera/camera2/pipe/Metadata$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Metadata {
    <T> T get(androidx.camera.camera2.pipe.Metadata.Key<T> key);

    <T> T getOrDefault(androidx.camera.camera2.pipe.Metadata.Key<T> key, T r2);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0010B\u001d\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata$Key;", "T", "", "", "p0", "Lkotlin/reflect/KClass;", "p1", "<init>", "(Ljava/lang/String;Lkotlin/reflect/KClass;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/reflect/KClass;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Key<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.Metadata.Key.Companion INSTANCE = new androidx.camera.camera2.pipe.Metadata.Key.Companion(null);
        private static final java.util.Map<java.lang.String, androidx.camera.camera2.pipe.Metadata.Key<?>> keys = new java.util.HashMap();

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final kotlin.reflect.KClass<?> getHighResolutionOutputSizeshNQ4ISI;

        private Key(java.lang.String str, kotlin.reflect.KClass<?> kClass) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = kClass;
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\n\b\u0001\u0010\u0004\u0018\u0001*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\tJ3\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\b\u0010\fR0\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\r8\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/Metadata$Key$Companion;", "", "<init>", "()V", "T", "", "name", "Landroidx/camera/camera2/pipe/Metadata$Key;", "create", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/Metadata$Key;", "Lkotlin/reflect/KClass;", "type", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Landroidx/camera/camera2/pipe/Metadata$Key;", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Ljava/util/Map;", "getKeys$camera_camera2_pipe", "()Ljava/util/Map;", "getKeys$camera_camera2_pipe$annotations"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            @kotlin.jvm.JvmStatic
            public static /* synthetic */ void getKeys$camera_camera2_pipe$annotations() {
            }

            private Companion() {
            }

            public final java.util.Map<java.lang.String, androidx.camera.camera2.pipe.Metadata.Key<?>> getKeys$camera_camera2_pipe() {
                return androidx.camera.camera2.pipe.Metadata.Key.keys;
            }

            public final /* synthetic */ <T> androidx.camera.camera2.pipe.Metadata.Key<T> create(java.lang.String name2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
                return create(name2, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class));
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final <T> androidx.camera.camera2.pipe.Metadata.Key<T> create(java.lang.String name2, kotlin.reflect.KClass<T> type) {
                androidx.camera.camera2.pipe.Metadata.Key<T> key;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
                synchronized (getKeys$camera_camera2_pipe()) {
                    java.util.Map<java.lang.String, androidx.camera.camera2.pipe.Metadata.Key<?>> keys$camera_camera2_pipe = androidx.camera.camera2.pipe.Metadata.Key.INSTANCE.getKeys$camera_camera2_pipe();
                    java.lang.Object obj = keys$camera_camera2_pipe.get(name2);
                    if (obj == null) {
                        obj = new androidx.camera.camera2.pipe.Metadata.Key(name2, type, null);
                        keys$camera_camera2_pipe.put(name2, obj);
                    }
                    key = (androidx.camera.camera2.pipe.Metadata.Key) obj;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.camera2.pipe.Metadata.Key) key).getHighResolutionOutputSizeshNQ4ISI, type)) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                }
                return key;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata.Key(");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ Key(java.lang.String str, kotlin.reflect.KClass kClass, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, kClass);
        }
    }
}
