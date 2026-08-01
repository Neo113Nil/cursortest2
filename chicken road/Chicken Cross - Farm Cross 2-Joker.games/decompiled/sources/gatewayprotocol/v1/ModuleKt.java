package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import gatewayprotocol.v1.ModuleOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleKt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgatewayprotocol/v1/ModuleKt;", "", "<init>", "()V", "Dsl", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ModuleKt {
    public static final ModuleKt INSTANCE = new ModuleKt();

    private ModuleKt() {
    }

    /* compiled from: ModuleKt.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lgatewayprotocol/v1/ModuleKt$Dsl;", "", "_builder", "Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;", "<init>", "(Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;)V", "_build", "Lgatewayprotocol/v1/ModuleOuterClass$Module;", "value", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "clearName", "", "initializerClass", "getInitializerClass", "setInitializerClass", "clearInitializerClass", "Lcom/google/protobuf/ByteString;", "config", "getConfig", "()Lcom/google/protobuf/ByteString;", "setConfig", "(Lcom/google/protobuf/ByteString;)V", "clearConfig", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ModuleOuterClass.Module.Builder _builder;

        public /* synthetic */ Dsl(ModuleOuterClass.Module.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(ModuleOuterClass.Module.Builder builder) {
            this._builder = builder;
        }

        /* compiled from: ModuleKt.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, d2 = {"Lgatewayprotocol/v1/ModuleKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lgatewayprotocol/v1/ModuleKt$Dsl;", "builder", "Lgatewayprotocol/v1/ModuleOuterClass$Module$Builder;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(ModuleOuterClass.Module.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ ModuleOuterClass.Module _build() {
            ModuleOuterClass.Module build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }

        public final String getName() {
            String name = this._builder.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        public final void setName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final String getInitializerClass() {
            String initializerClass = this._builder.getInitializerClass();
            Intrinsics.checkNotNullExpressionValue(initializerClass, "getInitializerClass(...)");
            return initializerClass;
        }

        public final void setInitializerClass(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInitializerClass(value);
        }

        public final void clearInitializerClass() {
            this._builder.clearInitializerClass();
        }

        public final ByteString getConfig() {
            ByteString config = this._builder.getConfig();
            Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
            return config;
        }

        public final void setConfig(ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setConfig(value);
        }

        public final void clearConfig() {
            this._builder.clearConfig();
        }
    }
}
