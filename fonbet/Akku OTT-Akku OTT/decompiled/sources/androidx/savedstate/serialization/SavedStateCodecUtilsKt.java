package androidx.savedstate.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.internal.B;
import kotlinx.serialization.internal.C1136f0;
import kotlinx.serialization.internal.C1139h;
import kotlinx.serialization.internal.C1157q;
import kotlinx.serialization.internal.K;
import kotlinx.serialization.internal.S0;
import kotlinx.serialization.internal.V;
import kotlinx.serialization.internal.W;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0017\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/descriptors/f;", "intListDescriptor", "Lkotlinx/serialization/descriptors/f;", "getIntListDescriptor", "()Lkotlinx/serialization/descriptors/f;", "stringListDescriptor", "getStringListDescriptor", "booleanArrayDescriptor", "getBooleanArrayDescriptor", "charArrayDescriptor", "getCharArrayDescriptor", "doubleArrayDescriptor", "getDoubleArrayDescriptor", "floatArrayDescriptor", "getFloatArrayDescriptor", "intArrayDescriptor", "getIntArrayDescriptor", "longArrayDescriptor", "getLongArrayDescriptor", "stringArrayDescriptor", "getStringArrayDescriptor", "getStringArrayDescriptor$annotations", "()V", "savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,41:1\n194#2:42\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n*L\n40#1:42\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateCodecUtilsKt {
    private static final f booleanArrayDescriptor;
    private static final f charArrayDescriptor;
    private static final f doubleArrayDescriptor;
    private static final f floatArrayDescriptor;
    private static final f intArrayDescriptor;
    private static final f intListDescriptor;
    private static final f longArrayDescriptor;
    private static final f stringArrayDescriptor;
    private static final f stringListDescriptor;

    static {
        Intrinsics.checkNotNullParameter(IntCompanionObject.INSTANCE, "<this>");
        intListDescriptor = kotlinx.serialization.builtins.a.b(W.a).b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        kotlinx.serialization.builtins.a.d(stringCompanionObject);
        S0 s0 = S0.a;
        stringListDescriptor = kotlinx.serialization.builtins.a.b(s0).b;
        booleanArrayDescriptor = C1139h.c.b;
        charArrayDescriptor = C1157q.c.b;
        doubleArrayDescriptor = B.c.b;
        floatArrayDescriptor = K.c.b;
        intArrayDescriptor = V.c.b;
        longArrayDescriptor = C1136f0.c.b;
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        stringArrayDescriptor = kotlinx.serialization.builtins.a.a(Reflection.getOrCreateKotlinClass(String.class), s0).c;
    }

    public static final f getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final f getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final f getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final f getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final f getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final f getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final f getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final f getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    public static final f getStringListDescriptor() {
        return stringListDescriptor;
    }
}
