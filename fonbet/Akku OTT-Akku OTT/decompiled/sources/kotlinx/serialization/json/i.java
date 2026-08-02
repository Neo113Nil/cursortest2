package kotlinx.serialization.json;

import androidx.collection.SieveCacheKt;
import com.google.common.collect.C0971t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.internal.S;
import kotlinx.serialization.internal.S0;
import kotlinx.serialization.json.internal.F;

@SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,348:1\n338#1,4:349\n330#1,4:353\n338#1,4:357\n330#1,4:361\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n259#1:349,4\n269#1:353,4\n278#1:357,4\n285#1:361,4\n*E\n"})
/* loaded from: classes5.dex */
public final class i {
    public static final S a;

    static {
        kotlinx.serialization.builtins.a.d(StringCompanionObject.INSTANCE);
        a = C0971t.a("kotlinx.serialization.json.JsonUnquotedLiteral", S0.a);
    }

    public static final int a(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        try {
            long h = new F(zVar.a()).h();
            if (SieveCacheKt.NodeMetaAndPreviousMask <= h && h <= SieveCacheKt.NodeLinkMask) {
                return (int) h;
            }
            throw new NumberFormatException(zVar.a() + " is not an Int");
        } catch (kotlinx.serialization.json.internal.k e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final z b(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        z zVar = hVar instanceof z ? (z) hVar : null;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalArgumentException("Element " + Reflection.getOrCreateKotlinClass(hVar.getClass()) + " is not a JsonPrimitive");
    }
}
