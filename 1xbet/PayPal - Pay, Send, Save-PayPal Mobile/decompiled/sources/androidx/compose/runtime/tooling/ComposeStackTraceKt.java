package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\r\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0013\u001a\u00020\u000b*\u00060\tj\u0002`\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\r"}, d2 = {"", "Lkotlin/Function0;", "Landroidx/compose/runtime/tooling/ComposeStackTrace;", "trace", "", "tryAttachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Z", "attachComposeStackTrace", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", "appendStackTrace", "(Ljava/lang/StringBuilder;Landroidx/compose/runtime/tooling/ComposeStackTrace;)V", "appendSourceInformationStackTrace", "", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "filterInternalFramesByGroupKey", "(Landroidx/compose/runtime/tooling/ComposeStackTrace;)Ljava/util/List;", "appendGroupKeyStackTrace"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeStackTraceKt {
    public static final boolean tryAttachComposeStackTrace(java.lang.Throwable th, kotlin.jvm.functions.Function0<androidx.compose.runtime.tooling.ComposeStackTrace> function0) {
        androidx.compose.runtime.tooling.DiagnosticComposeException diagnosticComposeException;
        androidx.compose.runtime.tooling.DiagnosticComposeException diagnosticComposeException2;
        java.util.List<java.lang.Throwable> suppressedExceptions = kotlin.ExceptionsKt.getSuppressedExceptions(th);
        int size = suppressedExceptions.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (suppressedExceptions.get(i) instanceof androidx.compose.runtime.tooling.DiagnosticComposeException) {
                return false;
            }
        }
        try {
            androidx.compose.runtime.tooling.ComposeStackTrace invoke = function0.invoke();
            if (invoke != null && !invoke.getFrames().isEmpty()) {
                z = true;
            }
            if (z) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke);
                diagnosticComposeException2 = new androidx.compose.runtime.tooling.DiagnosticComposeException(invoke);
            } else {
                diagnosticComposeException2 = null;
            }
            diagnosticComposeException = diagnosticComposeException2;
        } catch (java.lang.Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            kotlin.ExceptionsKt.addSuppressed(th, diagnosticComposeException);
        }
        return z;
    }

    public static final java.lang.Throwable attachComposeStackTrace(java.lang.Throwable th, kotlin.jvm.functions.Function0<androidx.compose.runtime.tooling.ComposeStackTrace> function0) {
        tryAttachComposeStackTrace(th, function0);
        return th;
    }

    public static final void appendStackTrace(java.lang.StringBuilder sb, androidx.compose.runtime.tooling.ComposeStackTrace composeStackTrace) {
        if (composeStackTrace.getHasSourceInformation()) {
            appendSourceInformationStackTrace(sb, composeStackTrace);
        } else {
            appendGroupKeyStackTrace(sb, composeStackTrace);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void appendSourceInformationStackTrace(java.lang.StringBuilder sb, androidx.compose.runtime.tooling.ComposeStackTrace composeStackTrace) {
        java.lang.String sourceFile;
        java.lang.String str;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.List asReversed = kotlin.collections.CollectionsKt.asReversed(composeStackTrace.getFrames());
        int size = asReversed.size();
        java.lang.String str2 = null;
        java.lang.String str3 = null;
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame = (androidx.compose.runtime.tooling.ComposeStackTraceFrame) asReversed.get(i);
            androidx.compose.runtime.tooling.SourceInformation sourceInfo = composeStackTraceFrame.getSourceInfo();
            if (sourceInfo != null) {
                java.lang.String functionName = sourceInfo.getFunctionName();
                if (functionName == null) {
                    functionName = sourceInfo.getIsCall() ? "<lambda>" : null;
                    if (functionName == null) {
                        if (str2 == null) {
                            str2 = "<unknown function>";
                        }
                        sourceFile = sourceInfo.getSourceFile();
                        if (sourceFile == null) {
                            str3 = sourceFile;
                        } else if (str3 == null) {
                            str3 = "<unknown file>";
                        }
                        java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> locations = sourceInfo.getLocations();
                        if (composeStackTraceFrame.getGroupOffset() == null && composeStackTraceFrame.getGroupOffset().intValue() < locations.size()) {
                            str = java.lang.String.valueOf(locations.get(composeStackTraceFrame.getGroupOffset().intValue()).getLineNumber());
                        } else {
                            str = "<unknown line>";
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str2);
                        sb2.append('(');
                        sb2.append(str3);
                        sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                        sb2.append(str);
                        sb2.append(')');
                        java.lang.String obj = sb2.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                        if (!sourceInfo.getIsCall()) {
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(sourceInfo.getFunctionName(), "rememberCompositionContext") || !kotlin.jvm.internal.Intrinsics.areEqual(sourceInfo.getPackageHash(), "9igjgp")) {
                            createListBuilder.add(obj);
                        }
                    }
                }
                str2 = functionName;
                sourceFile = sourceInfo.getSourceFile();
                if (sourceFile == null) {
                }
                java.util.List<androidx.compose.runtime.tooling.LocationSourceInformation> locations2 = sourceInfo.getLocations();
                if (composeStackTraceFrame.getGroupOffset() == null) {
                }
                str = "<unknown line>";
                java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                sb22.append(str2);
                sb22.append('(');
                sb22.append(str3);
                sb22.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                sb22.append(str);
                sb22.append(')');
                java.lang.String obj2 = sb22.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                if (!sourceInfo.getIsCall()) {
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(sourceInfo.getFunctionName(), "rememberCompositionContext")) {
                }
                createListBuilder.add(obj2);
            }
        }
        java.util.List asReversed2 = kotlin.collections.CollectionsKt.asReversed(kotlin.collections.CollectionsKt.build(createListBuilder));
        int size2 = asReversed2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            java.lang.String str4 = (java.lang.String) asReversed2.get(i2);
            sb.append("\tat ");
            sb.append(str4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        }
    }

    public static final java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> filterInternalFramesByGroupKey(androidx.compose.runtime.tooling.ComposeStackTrace composeStackTrace) {
        int[] iArr = {201, 202, 204, 206, 207, 125, androidx.compose.runtime.ComposerKt.defaultsKey, androidx.compose.runtime.MovableContentKt.movableContentKey, 200};
        int size = composeStackTrace.getFrames().size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame = composeStackTrace.getFrames().get(i);
            if (!kotlin.collections.ArraysKt.contains(iArr, composeStackTraceFrame.getGroupKey())) {
                if (composeStackTraceFrame.getGroupKey() == 100) {
                    int i2 = i + 2;
                    if (i2 < size && composeStackTrace.getFrames().get(i2).getGroupKey() == 1000) {
                        break;
                    }
                    kotlin.collections.CollectionsKt.removeLastOrNull(arrayList);
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
        }
        return arrayList;
    }

    public static final void appendGroupKeyStackTrace(java.lang.StringBuilder sb, androidx.compose.runtime.tooling.ComposeStackTrace composeStackTrace) {
        java.util.List<androidx.compose.runtime.tooling.ComposeStackTraceFrame> filterInternalFramesByGroupKey = filterInternalFramesByGroupKey(composeStackTrace);
        int size = filterInternalFramesByGroupKey.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.tooling.ComposeStackTraceFrame composeStackTraceFrame = filterInternalFramesByGroupKey.get(i);
            sb.append("\tat $$compose.m$");
            sb.append(composeStackTraceFrame.getGroupKey());
            sb.append("(SourceFile:1)");
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
        }
    }
}
