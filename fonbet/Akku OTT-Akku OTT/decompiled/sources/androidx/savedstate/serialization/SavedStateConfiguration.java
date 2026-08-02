package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.modules.d;
import kotlinx.serialization.modules.e;
import kotlinx.serialization.modules.g;
import kotlinx.serialization.modules.h;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "", "Lkotlinx/serialization/modules/d;", "serializersModule", "", "classDiscriminatorMode", "", "encodeDefaults", "<init>", "(Lkotlinx/serialization/modules/d;IZ)V", "Lkotlinx/serialization/modules/d;", "getSerializersModule", "()Lkotlinx/serialization/modules/d;", "I", "getClassDiscriminatorMode", "()I", "Z", "getEncodeDefaults", "()Z", "Companion", "Builder", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateConfiguration {

    @JvmField
    public static final SavedStateConfiguration DEFAULT = new SavedStateConfiguration(null, 0, false, 7, null);
    private final int classDiscriminatorMode;
    private final boolean encodeDefaults;
    private final d serializersModule;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "<init>", "(Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "build$savedstate_release", "()Landroidx/savedstate/serialization/SavedStateConfiguration;", "build", "Lkotlinx/serialization/modules/d;", "serializersModule", "Lkotlinx/serialization/modules/d;", "getSerializersModule", "()Lkotlinx/serialization/modules/d;", "setSerializersModule", "(Lkotlinx/serialization/modules/d;)V", "", "encodeDefaults", "Z", "getEncodeDefaults", "()Z", "setEncodeDefaults", "(Z)V", "getEncodeDefaults$annotations", "()V", "", "classDiscriminatorMode", "I", "getClassDiscriminatorMode", "()I", "setClassDiscriminatorMode", "(I)V", "getClassDiscriminatorMode$annotations", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private int classDiscriminatorMode;
        private boolean encodeDefaults;
        private d serializersModule;

        public Builder(SavedStateConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.serializersModule = configuration.getSerializersModule();
            this.encodeDefaults = configuration.getEncodeDefaults();
            this.classDiscriminatorMode = configuration.getClassDiscriminatorMode();
        }

        public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
        }

        public static /* synthetic */ void getEncodeDefaults$annotations() {
        }

        public final SavedStateConfiguration build$savedstate_release() {
            d module;
            module = SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE;
            d other = this.serializersModule;
            kotlinx.serialization.modules.b bVar = h.a;
            Intrinsics.checkNotNullParameter(module, "<this>");
            Intrinsics.checkNotNullParameter(other, "other");
            e eVar = new e();
            Intrinsics.checkNotNullParameter(module, "module");
            module.a(eVar);
            other.a(new g(eVar));
            return new SavedStateConfiguration(eVar.f(), this.classDiscriminatorMode, this.encodeDefaults, null);
        }

        public final int getClassDiscriminatorMode() {
            return this.classDiscriminatorMode;
        }

        public final boolean getEncodeDefaults() {
            return this.encodeDefaults;
        }

        public final d getSerializersModule() {
            return this.serializersModule;
        }

        public final void setClassDiscriminatorMode(int i) {
            this.classDiscriminatorMode = i;
        }

        public final void setEncodeDefaults(boolean z) {
            this.encodeDefaults = z;
        }

        public final void setSerializersModule(d dVar) {
            Intrinsics.checkNotNullParameter(dVar, "<set-?>");
            this.serializersModule = dVar;
        }
    }

    public /* synthetic */ SavedStateConfiguration(d dVar, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, i, z);
    }

    public final int getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final d getSerializersModule() {
        return this.serializersModule;
    }

    private SavedStateConfiguration(d dVar, int i, boolean z) {
        this.serializersModule = dVar;
        this.classDiscriminatorMode = i;
        this.encodeDefaults = z;
    }

    public /* synthetic */ SavedStateConfiguration(d dVar, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? SavedStateConfigurationKt.DEFAULT_SERIALIZERS_MODULE : dVar, (i2 & 2) != 0 ? 2 : i, (i2 & 4) != 0 ? false : z);
    }
}
