package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\u00060\u0007j\u0002`\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\r\"\u00020\u00072\u00020\u0007"}, d2 = {"Lkotlin/reflect/KClass;", "kClass", "", "methodName", "fileName", "", "lineNumber", "Ljava/lang/StackTraceElement;", "Lio/ktor/util/getHighSpeedVideoFpsRanges;", "createStackTraceElement", "(Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StackFramesJvmKt {
    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    public static final java.lang.StackTraceElement createStackTraceElement(kotlin.reflect.KClass<?> kClass, java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new java.lang.StackTraceElement(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass).getName(), str, str2, i);
    }
}
