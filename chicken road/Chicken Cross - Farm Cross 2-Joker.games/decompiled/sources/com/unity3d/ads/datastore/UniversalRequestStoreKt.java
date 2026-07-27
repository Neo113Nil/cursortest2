package com.unity3d.ads.datastore;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UniversalRequestStoreKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/datastore/UniversalRequestStoreKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalRequestStoreKt {
    public static final UniversalRequestStoreKt INSTANCE = new UniversalRequestStoreKt();

    private UniversalRequestStoreKt() {
    }

    /* compiled from: UniversalRequestStoreKt.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J3\u0010\u000f\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0002\b\u0013J4\u0010\u0014\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000bH\u0087\n¢\u0006\u0002\b\u0015J+\u0010\u0016\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0017J7\u0010\u0018\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u001aH\u0007¢\u0006\u0002\b\u001bJ#\u0010\u001c\u001a\u00020\u0010*\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tH\u0007¢\u0006\u0002\b\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/unity3d/ads/datastore/UniversalRequestStoreKt$Dsl;", "", "_builder", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore$Builder;", "<init>", "(Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore$Builder;)V", "_build", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore;", "universalRequestMap", "Lcom/google/protobuf/kotlin/DslMap;", "", "Lcom/google/protobuf/ByteString;", "Lcom/unity3d/ads/datastore/UniversalRequestStoreKt$Dsl$UniversalRequestMapProxy;", "getUniversalRequestMapMap", "()Lcom/google/protobuf/kotlin/DslMap;", "put", "", "key", "value", "putUniversalRequestMap", "set", "setUniversalRequestMap", "remove", "removeUniversalRequestMap", "putAll", "map", "", "putAllUniversalRequestMap", "clear", "clearUniversalRequestMap", k.M, "UniversalRequestMapProxy", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UniversalRequestStoreOuterClass.UniversalRequestStore.Builder _builder;

        public /* synthetic */ Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: UniversalRequestStoreKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/datastore/UniversalRequestStoreKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/unity3d/ads/datastore/UniversalRequestStoreKt$Dsl;", "builder", "Lcom/unity3d/ads/datastore/UniversalRequestStoreOuterClass$UniversalRequestStore$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ UniversalRequestStoreOuterClass.UniversalRequestStore _build() {
            UniversalRequestStoreOuterClass.UniversalRequestStore build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        /* compiled from: UniversalRequestStoreKt.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/unity3d/ads/datastore/UniversalRequestStoreKt$Dsl$UniversalRequestMapProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UniversalRequestMapProxy extends DslProxy {
            private UniversalRequestMapProxy() {
            }
        }

        public final /* synthetic */ DslMap getUniversalRequestMapMap() {
            Map<String, ByteString> universalRequestMapMap = this._builder.getUniversalRequestMapMap();
            Intrinsics.checkNotNullExpressionValue(universalRequestMapMap, "getUniversalRequestMapMap(...)");
            return new DslMap(universalRequestMapMap);
        }

        public final void putUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String key, ByteString value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.putUniversalRequestMap(key, value);
        }

        public final /* synthetic */ void setUniversalRequestMap(DslMap<String, ByteString, UniversalRequestMapProxy> dslMap, String key, ByteString value) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            putUniversalRequestMap(dslMap, key, value);
        }

        public final /* synthetic */ void removeUniversalRequestMap(DslMap dslMap, String key) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            this._builder.removeUniversalRequestMap(key);
        }

        public final /* synthetic */ void putAllUniversalRequestMap(DslMap dslMap, Map map) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            Intrinsics.checkNotNullParameter(map, "map");
            this._builder.putAllUniversalRequestMap(map);
        }

        public final /* synthetic */ void clearUniversalRequestMap(DslMap dslMap) {
            Intrinsics.checkNotNullParameter(dslMap, "<this>");
            this._builder.clearUniversalRequestMap();
        }
    }
}
