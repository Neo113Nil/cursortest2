package com.paypal.oslo.feature.identity.moreoptions.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "FetchOptions", "Initialize", "ToggleShowMore", "SelectOption", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS, "OptionsLoadSuccess", "OptionsLoadFailure", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$Dismiss;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$FetchOptions;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$OptionsLoadFailure;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$OptionsLoadSuccess;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$SelectOption;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$ToggleShowMore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MoreOptionsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MoreOptionsEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$FetchOptions;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "currentOptionType", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)V", "component1", "()Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "copy", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$FetchOptions;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "getCurrentOptionType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FetchOptions extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType currentOptionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FetchOptions(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
            super("MoreOptionsEvent.FetchOptions", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
            this.currentOptionType = optionType;
        }

        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getCurrentOptionType() {
            return this.currentOptionType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = this.currentOptionType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FetchOptions(currentOptionType=");
            sb.append(optionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.currentOptionType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions) && this.currentOptionType == ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions) other).currentOptionType;
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions copy(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType currentOptionType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentOptionType, "");
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions(currentOptionType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getCurrentOptionType() {
            return this.currentOptionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.FetchOptions fetchOptions, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optionType = fetchOptions.currentOptionType;
            }
            return fetchOptions.copy(optionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list) {
            super("MoreOptionsEvent.Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize) other).options);
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Initialize initialize, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = initialize.options;
            }
            return initialize.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$ToggleShowMore;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToggleShowMore extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.ToggleShowMore INSTANCE = new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.ToggleShowMore();

        public final int hashCode() {
            return 296710477;
        }

        private ToggleShowMore() {
            super("MoreOptionsEvent.ToggleShowMore", null);
        }

        public final java.lang.String toString() {
            return "ToggleShowMore";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.ToggleShowMore)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$SelectOption;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "type", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)V", "component1", "()Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "copy", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$SelectOption;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectOption extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectOption(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
            super("MoreOptionsEvent.SelectOption", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
            this.type = optionType;
        }

        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectOption(type=");
            sb.append(optionType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.type.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption) && this.type == ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption) other).type;
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption copy(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption(type);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.SelectOption selectOption, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                optionType = selectOption.type;
            }
            return selectOption.copy(optionType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$Dismiss;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dismiss extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Dismiss INSTANCE = new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Dismiss();

        public final int hashCode() {
            return 518575747;
        }

        private Dismiss() {
            super("MoreOptionsEvent.Dismiss", null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_DISMISS;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.Dismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$OptionsLoadSuccess;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/Option;", "options", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$OptionsLoadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OptionsLoadSuccess extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionsLoadSuccess(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list) {
            super("MoreOptionsEvent.OptionsLoadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionsLoadSuccess(options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess) other).options);
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess copy(java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess(options);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> component1() {
            return this.options;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadSuccess optionsLoadSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = optionsLoadSuccess.options;
            }
            return optionsLoadSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$OptionsLoadFailure;", "Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/moreoptions/ui/MoreOptionsEvent$OptionsLoadFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OptionsLoadFailure extends com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent {
        public static final int $stable = 0;
        private final java.lang.String message;

        public OptionsLoadFailure(java.lang.String str) {
            super("MoreOptionsEvent.OptionsLoadFailure", null);
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionsLoadFailure(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure) other).message);
        }

        public final com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure copy(java.lang.String message) {
            return new com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure copy$default(com.paypal.oslo.feature.identity.moreoptions.ui.MoreOptionsEvent.OptionsLoadFailure optionsLoadFailure, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = optionsLoadFailure.message;
            }
            return optionsLoadFailure.copy(str);
        }
    }

    public /* synthetic */ MoreOptionsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
