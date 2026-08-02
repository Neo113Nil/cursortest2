package androidx.savedstate.serialization;

import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.serialization.serializers.SizeFSerializer;
import androidx.savedstate.serialization.serializers.SizeSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.modules.d;
import kotlinx.serialization.modules.e;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/d;", "getDefaultSerializersModuleOnPlatform", "()Lkotlinx/serialization/modules/d;", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateConfig.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,33:1\n31#2,2:34\n243#2:36\n243#2:37\n33#2:38\n*S KotlinDebug\n*F\n+ 1 SavedStateConfig.android.kt\nandroidx/savedstate/serialization/SavedStateConfig_androidKt\n*L\n26#1:34,2\n27#1:36\n28#1:37\n26#1:38\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateConfig_androidKt {
    public static final d getDefaultSerializersModuleOnPlatform() {
        e eVar = new e();
        eVar.c(Reflection.getOrCreateKotlinClass(Size.class), SizeSerializer.INSTANCE);
        eVar.c(Reflection.getOrCreateKotlinClass(SizeF.class), SizeFSerializer.INSTANCE);
        eVar.e(Reflection.getOrCreateKotlinClass(SparseArray.class), new a(0));
        return eVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.serialization.b getDefaultSerializersModuleOnPlatform$lambda$1$lambda$0(List argSerializers) {
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        return new SparseArraySerializer((kotlinx.serialization.b) CollectionsKt.first(argSerializers));
    }
}
