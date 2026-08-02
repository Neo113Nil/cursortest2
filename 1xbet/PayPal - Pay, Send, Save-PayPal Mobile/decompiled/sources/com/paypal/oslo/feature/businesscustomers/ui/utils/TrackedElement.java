package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0012\u0013\u0014À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "", "", "getName", "()Ljava/lang/String;", "name", "getFeature", "feature", "getAction", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "getContexts", "()Ljava/util/List;", "contexts", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Module, "Component", "Item", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Component;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Item;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Module;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface TrackedElement {
    java.lang.String getAction();

    java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts();

    java.lang.String getFeature();

    java.lang.String getName();

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Module;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "", "name", "feature", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Module;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getFeature", "getAction", "Ljava/util/List;", "getContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Module implements com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
        private final java.lang.String feature;
        private final java.lang.String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Module(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.name = str;
            this.feature = str2;
            this.action = str3;
            this.contexts = list;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getName() {
            return this.name;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getAction() {
            return this.action;
        }

        public /* synthetic */ Module(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
            return this.contexts;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.feature;
            java.lang.String str3 = this.action;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.contexts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Module(name=");
            sb.append(str);
            sb.append(", feature=");
            sb.append(str2);
            sb.append(", action=");
            sb.append(str3);
            sb.append(", contexts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.feature;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.action;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.contexts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module module = (com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, module.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, module.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, module.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, module.contexts);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module copy(java.lang.String name2, java.lang.String feature, java.lang.String action, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module(name2, feature, action, contexts);
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component4() {
            return this.contexts;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module copy$default(com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Module module, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = module.name;
            }
            if ((i & 2) != 0) {
                str2 = module.feature;
            }
            if ((i & 4) != 0) {
                str3 = module.action;
            }
            if ((i & 8) != 0) {
                list = module.contexts;
            }
            return module.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Component;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "", "name", "feature", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Component;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getFeature", "getAction", "Ljava/util/List;", "getContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Component implements com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
        private final java.lang.String feature;
        private final java.lang.String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Component(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.name = str;
            this.feature = str2;
            this.action = str3;
            this.contexts = list;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getName() {
            return this.name;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getAction() {
            return this.action;
        }

        public /* synthetic */ Component(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
            return this.contexts;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.feature;
            java.lang.String str3 = this.action;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.contexts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Component(name=");
            sb.append(str);
            sb.append(", feature=");
            sb.append(str2);
            sb.append(", action=");
            sb.append(str3);
            sb.append(", contexts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.feature;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.action;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.contexts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component component = (com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, component.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, component.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, component.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, component.contexts);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component copy(java.lang.String name2, java.lang.String feature, java.lang.String action, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component(name2, feature, action, contexts);
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component4() {
            return this.contexts;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component copy$default(com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Component component, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = component.name;
            }
            if ((i & 2) != 0) {
                str2 = component.feature;
            }
            if ((i & 4) != 0) {
                str3 = component.action;
            }
            if ((i & 8) != 0) {
                list = component.contexts;
            }
            return component.copy(str, str2, str3, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Item;", "Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement;", "", "name", "feature", "action", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "contexts", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/businesscustomers/ui/utils/TrackedElement$Item;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getFeature", "getAction", "Ljava/util/List;", "getContexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Item implements com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts;
        private final java.lang.String feature;
        private final java.lang.String name;

        /* JADX WARN: Multi-variable type inference failed */
        public Item(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.name = str;
            this.feature = str2;
            this.action = str3;
            this.contexts = list;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getName() {
            return this.name;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.lang.String getAction() {
            return this.action;
        }

        public /* synthetic */ Item(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        @Override // com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement
        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> getContexts() {
            return this.contexts;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.String str2 = this.feature;
            java.lang.String str3 = this.action;
            java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list = this.contexts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
            sb.append(str);
            sb.append(", feature=");
            sb.append(str2);
            sb.append(", action=");
            sb.append(str3);
            sb.append(", contexts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode();
            java.lang.String str = this.feature;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.action;
            return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.contexts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item item = (com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, item.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, item.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.contexts, item.contexts);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item copy(java.lang.String name2, java.lang.String feature, java.lang.String action, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> contexts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contexts, "");
            return new com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item(name2, feature, action, contexts);
        }

        public final java.util.List<com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> component4() {
            return this.contexts;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item copy$default(com.paypal.oslo.feature.businesscustomers.ui.utils.TrackedElement.Item item, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = item.name;
            }
            if ((i & 2) != 0) {
                str2 = item.feature;
            }
            if ((i & 4) != 0) {
                str3 = item.action;
            }
            if ((i & 8) != 0) {
                list = item.contexts;
            }
            return item.copy(str, str2, str3, list);
        }
    }
}
