package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "Landroidx/compose/ui/tooling/ViewInfo;", "Lkotlin/Function1;", "", "p0", "getHighSpeedVideoSizes", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "indentation", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "", "toDebugString", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewInfoUtil_androidKt {
    public static /* synthetic */ boolean $r8$lambda$JFC6KizVRu8aAN8nSi1WfC3QwoQ(androidx.compose.ui.tooling.ViewInfo viewInfo) {
        return true;
    }

    /* renamed from: $r8$lambda$hKqWkK-2sqJkz9lmLXp4YuqHwTU, reason: not valid java name */
    public static /* synthetic */ boolean m8515$r8$lambda$hKqWkK2sqJkz9lmLXp4YuqHwTU(androidx.compose.ui.tooling.ViewInfo viewInfo) {
        return true;
    }

    private static final java.util.List<androidx.compose.ui.tooling.ViewInfo> getHighSpeedVideoSizes(java.util.List<androidx.compose.ui.tooling.ViewInfo> list, kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.ViewInfo, java.lang.Boolean> function1) {
        java.util.List listOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.compose.ui.tooling.ViewInfo viewInfo : list) {
            java.util.List<androidx.compose.ui.tooling.ViewInfo> highSpeedVideoSizes = getHighSpeedVideoSizes(viewInfo.getChildren(), function1);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (androidx.compose.ui.tooling.ViewInfo viewInfo2 : highSpeedVideoSizes) {
                kotlin.collections.CollectionsKt.addAll(arrayList2, viewInfo2.getLocation() == null ? viewInfo2.getChildren() : kotlin.collections.CollectionsKt.listOf(viewInfo2));
            }
            java.util.ArrayList arrayList3 = arrayList2;
            if (function1.invoke(viewInfo).booleanValue()) {
                listOf = kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.tooling.ViewInfo(viewInfo.getFileName(), viewInfo.getLineNumber(), viewInfo.getBounds(), viewInfo.getLocation(), arrayList3, viewInfo.getLayoutInfo(), viewInfo.getName()));
            } else {
                listOf = kotlin.collections.CollectionsKt.listOf(new androidx.compose.ui.tooling.ViewInfo("<root>", -1, androidx.compose.ui.unit.IntRect.INSTANCE.getZero(), null, arrayList3, null, null));
            }
            kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
        }
        return arrayList;
    }

    public static /* synthetic */ java.lang.String toDebugString$default(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(androidx.compose.ui.tooling.ViewInfoUtil_androidKt.m8515$r8$lambda$hKqWkK2sqJkz9lmLXp4YuqHwTU((androidx.compose.ui.tooling.ViewInfo) obj2));
                }
            };
        }
        return toDebugString(list, i, function1);
    }

    public static final java.lang.String toDebugString(java.util.List<androidx.compose.ui.tooling.ViewInfo> list, int i, kotlin.jvm.functions.Function1<? super androidx.compose.ui.tooling.ViewInfo, java.lang.Boolean> function1) {
        java.lang.String repeat = kotlin.text.StringsKt.repeat(".", i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (androidx.compose.ui.tooling.ViewInfo viewInfo : kotlin.collections.CollectionsKt.sortedWith(getHighSpeedVideoSizes(list, function1), kotlin.comparisons.ComparisonsKt.compareBy(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Comparable fileName;
                fileName = ((androidx.compose.ui.tooling.ViewInfo) obj).getFileName();
                return fileName;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Comparable valueOf;
                valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.tooling.ViewInfo) obj).getLineNumber());
                return valueOf;
            }
        }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.ui.tooling.ViewInfoUtil_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Comparable valueOf;
                valueOf = java.lang.Integer.valueOf(((androidx.compose.ui.tooling.ViewInfo) obj).allChildren().size());
                return valueOf;
            }
        }))) {
            if (viewInfo.getLocation() != null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(repeat);
                sb2.append('|');
                sb2.append(viewInfo.getFileName());
                sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                sb2.append(viewInfo.getLineNumber());
                sb.append(sb2.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            } else {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(repeat);
                sb3.append("|<root>");
                sb.append(sb3.toString());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            }
            java.lang.String obj = kotlin.text.StringsKt.trim(toDebugString(viewInfo.getChildren(), i + 1, function1)).toString();
            if (obj.length() > 0) {
                sb.append(obj);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            }
        }
        return sb.toString();
    }
}
