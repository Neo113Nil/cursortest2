package com.datadog.android.compose.internal.utils;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils;", "", "<init>", "()V", "Landroidx/compose/ui/node/LayoutNode;", "node", "Landroidx/compose/ui/geometry/Rect;", "getLayoutNodeBoundsInWindow", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/geometry/Rect;", "Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils$TargetNode;", "resolveLayoutNode", "(Landroidx/compose/ui/node/LayoutNode;)Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils$TargetNode;", "T", "", "p0", "Lkotlin/Function0;", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "TargetNode"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LayoutNodeUtils {
    public static final int $stable = 0;

    public final com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode resolveLayoutNode(final androidx.compose.ui.node.LayoutNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        return (com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode) getHighSpeedVideoFpsRangesFor("resolveLayoutNode", new kotlin.jvm.functions.Function0<com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode>() { // from class: com.datadog.android.compose.internal.utils.LayoutNodeUtils$resolveLayoutNode$1
            /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode invoke() {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.Iterator<androidx.compose.ui.layout.ModifierInfo> it = androidx.compose.ui.node.LayoutNode.this.getModifierInfo().iterator();
                boolean z = false;
                boolean z2 = false;
                java.lang.Boolean bool = null;
                androidx.compose.ui.semantics.Role role = null;
                java.lang.String str = null;
                while (it.hasNext()) {
                    androidx.compose.ui.Modifier modifier = it.next().getModifier();
                    if (modifier instanceof androidx.compose.ui.semantics.SemanticsModifier) {
                        androidx.compose.ui.semantics.SemanticsConfiguration semanticsConfiguration = ((androidx.compose.ui.semantics.SemanticsModifier) modifier).getSemanticsConfiguration();
                        if (semanticsConfiguration.contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getOnClick())) {
                            z = true;
                        }
                        if (semanticsConfiguration.contains(androidx.compose.ui.semantics.SemanticsActions.INSTANCE.getScrollBy())) {
                            z2 = true;
                        }
                        java.lang.String str2 = (java.lang.String) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, com.datadog.android.compose.DatadogModifierKt.getDatadogSemanticsPropertyKey());
                        if (str2 != null) {
                            str = str2;
                        }
                        if (bool == null) {
                            bool = (java.lang.Boolean) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getSelected());
                        }
                        if (role == null) {
                            role = (androidx.compose.ui.semantics.Role) androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(semanticsConfiguration, androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getRole());
                        }
                    } else {
                        java.lang.String getHighResolutionOutputSizeshNQ4ISI = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(modifier.getClass()).getGetHighResolutionOutputSizeshNQ4ISI();
                        if (getHighResolutionOutputSizeshNQ4ISI != null) {
                            switch (getHighResolutionOutputSizeshNQ4ISI.hashCode()) {
                                case -1871578230:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.selection.SelectableElement")) {
                                        break;
                                    } else {
                                        if (role == null) {
                                            role = com.datadog.android.compose.internal.utils.LayoutNodeUtils.m9993access$getRolelTaeGT0(this, modifier, getHighResolutionOutputSizeshNQ4ISI);
                                        }
                                        z = true;
                                        break;
                                    }
                                case -1569485262:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.selection.ToggleableElement")) {
                                        break;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                case 647026425:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.CombinedClickableElement")) {
                                        break;
                                    } else {
                                        if (role == null) {
                                        }
                                        z = true;
                                        break;
                                    }
                                case 1001212884:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.ClickableElement")) {
                                        break;
                                    } else {
                                        if (role == null) {
                                        }
                                        z = true;
                                        break;
                                    }
                                case 1554181911:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.ScrollingLayoutElement")) {
                                        break;
                                    } else {
                                        z2 = true;
                                        break;
                                    }
                                case 1750836524:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.selection.TriStateToggleableElement")) {
                                        break;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                case 2005964811:
                                    if (!getHighResolutionOutputSizeshNQ4ISI.equals("androidx.compose.foundation.gestures.ScrollableElement")) {
                                        break;
                                    } else {
                                        z2 = true;
                                        break;
                                    }
                            }
                        }
                    }
                }
                if (bool != null) {
                    linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_SELECTED, java.lang.Boolean.valueOf(bool.booleanValue()));
                }
                if (role != null) {
                    linkedHashMap.put(com.datadog.android.rum.RumAttributes.ACTION_TARGET_ROLE, androidx.compose.ui.semantics.Role.m7792boximpl(role.getGetHighSpeedVideoSizes()));
                }
                if (str != null) {
                    return new com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode(str, z2, z, kotlin.collections.MapsKt.toMap(linkedHashMap));
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public final androidx.compose.ui.geometry.Rect getLayoutNodeBoundsInWindow(final androidx.compose.ui.node.LayoutNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        return (androidx.compose.ui.geometry.Rect) getHighSpeedVideoFpsRangesFor("getLayoutNodeBoundsInWindow", new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect>() { // from class: com.datadog.android.compose.internal.utils.LayoutNodeUtils$getLayoutNodeBoundsInWindow$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.geometry.Rect invoke() {
                androidx.compose.ui.geometry.Rect boundsInWindow;
                boundsInWindow = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(androidx.compose.ui.node.LayoutNode.this.getLayoutDelegate$ui_release().getOuterCoordinator().getCoordinates(), true);
                return boundsInWindow;
            }

            {
                super(0);
            }
        });
    }

    private static <T> T getHighSpeedVideoFpsRangesFor(final java.lang.String p0, kotlin.jvm.functions.Function0<? extends T> p1) {
        com.datadog.android.api.InternalLogger internalLogger;
        try {
            return p1.invoke();
        } catch (java.lang.Throwable th) {
            com.datadog.android.api.SdkCore instance$default = com.datadog.android.Datadog.getInstance$default(null, 1, null);
            com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = instance$default instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) instance$default : null;
            if (featureSdkCore != null && (internalLogger = featureSdkCore.getInternalLogger()) != null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.compose.internal.utils.LayoutNodeUtils$runSafe$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String str = p0;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutNodeUtils execution failure in ");
                        sb.append(str);
                        sb.append(".");
                        return sb.toString();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                }, th, true, (java.util.Map) null, 32, (java.lang.Object) null);
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils$TargetNode;", "", "", "tag", "", "isScrollable", "isClickable", "", "customAttributes", "<init>", "(Ljava/lang/String;ZZLjava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;ZZLjava/util/Map;)Lcom/datadog/android/compose/internal/utils/LayoutNodeUtils$TargetNode;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getCustomAttributes", "Z", "Ljava/lang/String;", "getTag"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class TargetNode {
        public static final int $stable = 8;
        private final java.util.Map<java.lang.String, java.lang.Object> customAttributes;
        private final boolean isClickable;
        private final boolean isScrollable;
        private final java.lang.String tag;

        public TargetNode(java.lang.String str, boolean z, boolean z2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.tag = str;
            this.isScrollable = z;
            this.isClickable = z2;
            this.customAttributes = map;
        }

        public final java.lang.String getTag() {
            return this.tag;
        }

        public final boolean isScrollable() {
            return this.isScrollable;
        }

        public final boolean isClickable() {
            return this.isClickable;
        }

        public /* synthetic */ TargetNode(java.lang.String str, boolean z, boolean z2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, z2, (i & 8) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes() {
            return this.customAttributes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.tag;
            boolean z = this.isScrollable;
            boolean z2 = this.isClickable;
            java.util.Map<java.lang.String, java.lang.Object> map = this.customAttributes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TargetNode(tag=");
            sb.append(str);
            sb.append(", isScrollable=");
            sb.append(z);
            sb.append(", isClickable=");
            sb.append(z2);
            sb.append(", customAttributes=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.tag.hashCode() * 31) + java.lang.Boolean.hashCode(this.isScrollable)) * 31) + java.lang.Boolean.hashCode(this.isClickable)) * 31) + this.customAttributes.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode)) {
                return false;
            }
            com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode targetNode = (com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.tag, targetNode.tag) && this.isScrollable == targetNode.isScrollable && this.isClickable == targetNode.isClickable && kotlin.jvm.internal.Intrinsics.areEqual(this.customAttributes, targetNode.customAttributes);
        }

        public final com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode copy(java.lang.String tag, boolean isScrollable, boolean isClickable, java.util.Map<java.lang.String, ? extends java.lang.Object> customAttributes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customAttributes, "");
            return new com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode(tag, isScrollable, isClickable, customAttributes);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component4() {
            return this.customAttributes;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsClickable() {
            return this.isClickable;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsScrollable() {
            return this.isScrollable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTag() {
            return this.tag;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode copy$default(com.datadog.android.compose.internal.utils.LayoutNodeUtils.TargetNode targetNode, java.lang.String str, boolean z, boolean z2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = targetNode.tag;
            }
            if ((i & 2) != 0) {
                z = targetNode.isScrollable;
            }
            if ((i & 4) != 0) {
                z2 = targetNode.isClickable;
            }
            if ((i & 8) != 0) {
                map = targetNode.customAttributes;
            }
            return targetNode.copy(str, z, z2, map);
        }
    }

    /* renamed from: access$getRole-lTaeGT0, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.semantics.Role m9993access$getRolelTaeGT0(com.datadog.android.compose.internal.utils.LayoutNodeUtils layoutNodeUtils, final java.lang.Object obj, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("getRole(");
        sb.append(str);
        sb.append(")");
        return (androidx.compose.ui.semantics.Role) getHighSpeedVideoFpsRangesFor(sb.toString(), new kotlin.jvm.functions.Function0<androidx.compose.ui.semantics.Role>() { // from class: com.datadog.android.compose.internal.utils.LayoutNodeUtils$getRole$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.semantics.Role invoke() {
                java.lang.reflect.Field declaredField = obj.getClass().getDeclaredField("role");
                declaredField.setAccessible(true);
                java.lang.Object obj2 = declaredField.get(obj);
                if (obj2 instanceof androidx.compose.ui.semantics.Role) {
                    return (androidx.compose.ui.semantics.Role) obj2;
                }
                return null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }
}
