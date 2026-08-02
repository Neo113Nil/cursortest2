package kotlin.coroutines.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "", "getHighSpeedVideoSizes", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I", "", "", "getSpilledVariableFieldMapping", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)[Ljava/lang/String;", "getNextLineNumber"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebugMetadataKt {
    private static final int getHighSpeedVideoSizes(kotlin.coroutines.jvm.internal.BaseContinuationImpl baseContinuationImpl) {
        if (baseContinuationImpl instanceof kotlin.coroutines.jvm.internal.TailCallBaseContinuationImpl) {
            return 0;
        }
        try {
            java.lang.reflect.Field declaredField = baseContinuationImpl.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(baseContinuationImpl);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            return -1;
        }
    }

    public static final int getNextLineNumber(kotlin.coroutines.jvm.internal.BaseContinuationImpl baseContinuationImpl) {
        int highSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseContinuationImpl, "");
        kotlin.coroutines.jvm.internal.DebugMetadata debugMetadata = (kotlin.coroutines.jvm.internal.DebugMetadata) baseContinuationImpl.getClass().getAnnotation(kotlin.coroutines.jvm.internal.DebugMetadata.class);
        if (debugMetadata != null && debugMetadata.v() >= 2 && (highSpeedVideoSizes = getHighSpeedVideoSizes(baseContinuationImpl)) >= 0 && highSpeedVideoSizes < debugMetadata.nl().length) {
            return debugMetadata.nl()[highSpeedVideoSizes];
        }
        return -1;
    }

    public static final java.lang.String[] getSpilledVariableFieldMapping(kotlin.coroutines.jvm.internal.BaseContinuationImpl baseContinuationImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseContinuationImpl, "");
        kotlin.coroutines.jvm.internal.DebugMetadata debugMetadata = (kotlin.coroutines.jvm.internal.DebugMetadata) baseContinuationImpl.getClass().getAnnotation(kotlin.coroutines.jvm.internal.DebugMetadata.class);
        if (debugMetadata == null || debugMetadata.v() <= 0) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int highSpeedVideoSizes = getHighSpeedVideoSizes(baseContinuationImpl);
        int[] i = debugMetadata.i();
        int length = i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i[i2] == highSpeedVideoSizes) {
                arrayList.add(debugMetadata.s()[i2]);
                arrayList.add(debugMetadata.n()[i2]);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public static final java.lang.StackTraceElement getStackTraceElement(kotlin.coroutines.jvm.internal.BaseContinuationImpl baseContinuationImpl) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseContinuationImpl, "");
        kotlin.coroutines.jvm.internal.DebugMetadata debugMetadata = (kotlin.coroutines.jvm.internal.DebugMetadata) baseContinuationImpl.getClass().getAnnotation(kotlin.coroutines.jvm.internal.DebugMetadata.class);
        if (debugMetadata == null || debugMetadata.v() <= 0) {
            return null;
        }
        int highSpeedVideoSizes = getHighSpeedVideoSizes(baseContinuationImpl);
        int i = highSpeedVideoSizes < 0 ? -1 : debugMetadata.l()[highSpeedVideoSizes];
        java.lang.String moduleName = kotlin.coroutines.jvm.internal.ModuleNameRetriever.INSTANCE.getModuleName(baseContinuationImpl);
        if (moduleName == null) {
            obj = debugMetadata.c();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(moduleName);
            sb.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
            sb.append(debugMetadata.c());
            obj = sb.toString();
        }
        return new java.lang.StackTraceElement(obj, debugMetadata.m(), debugMetadata.f(), i);
    }
}
