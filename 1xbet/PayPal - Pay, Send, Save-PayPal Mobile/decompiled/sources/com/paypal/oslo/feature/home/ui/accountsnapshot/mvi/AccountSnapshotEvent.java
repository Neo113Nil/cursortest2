package com.paypal.oslo.feature.home.ui.accountsnapshot.mvi;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadContent", "Retry", "ItemClicked", "ContentLoaded", "ContentLoadFailed", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ContentLoadFailed;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ContentLoaded;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ItemClicked;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$LoadContent;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$Retry;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class AccountSnapshotEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private AccountSnapshotEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$LoadContent;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadContent extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.LoadContent INSTANCE = new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.LoadContent();

        public final int hashCode() {
            return -225593547;
        }

        private LoadContent() {
            super("LoadContent", null);
        }

        public final java.lang.String toString() {
            return "LoadContent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.LoadContent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$Retry;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Retry extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.Retry INSTANCE = new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.Retry();

        public final int hashCode() {
            return 1929284266;
        }

        private Retry() {
            super("Retry", null);
        }

        public final java.lang.String toString() {
            return "Retry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.Retry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ItemClicked;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "item", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ItemClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ItemClicked extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem item;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemClicked(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem) {
            super("ItemClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotItem, "");
            this.item = accountSnapshotItem;
        }

        public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem getItem() {
            return this.item;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem = this.item;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ItemClicked(item=");
            sb.append(accountSnapshotItem);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.item.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.item, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked) other).item);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked copy(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem item) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked(item);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem getItem() {
            return this.item;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ItemClicked itemClicked, com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                accountSnapshotItem = itemClicked.item;
            }
            return itemClicked.copy(accountSnapshotItem);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ContentLoaded;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "section", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/Section;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ContentLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContentLoaded extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.Section<?> section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentLoaded(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            super("ContentLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            this.section = section;
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> getSection() {
            return this.section;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.section;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentLoaded(section=");
            sb.append(section);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.section.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.section, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded) other).section);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded copy(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded(section);
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> component1() {
            return this.section;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoaded contentLoaded, com.paypal.oslo.feature.home.domain.model.Section section, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = contentLoaded.section;
            }
            return contentLoaded.copy(section);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ContentLoadFailed;", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "errorSection", "<init>", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)V", "component1", "()Lcom/paypal/oslo/feature/home/domain/model/Section;", "copy", "(Lcom/paypal/oslo/feature/home/domain/model/Section;)Lcom/paypal/oslo/feature/home/ui/accountsnapshot/mvi/AccountSnapshotEvent$ContentLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "getErrorSection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContentLoadFailed extends com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.domain.model.Section<?> errorSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentLoadFailed(com.paypal.oslo.feature.home.domain.model.Section<?> section) {
            super("ContentLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
            this.errorSection = section;
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> getErrorSection() {
            return this.errorSection;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.domain.model.Section<?> section = this.errorSection;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentLoadFailed(errorSection=");
            sb.append(section);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorSection.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorSection, ((com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed) other).errorSection);
        }

        public final com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed copy(com.paypal.oslo.feature.home.domain.model.Section<?> errorSection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSection, "");
            return new com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed(errorSection);
        }

        public final com.paypal.oslo.feature.home.domain.model.Section<?> component1() {
            return this.errorSection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed copy$default(com.paypal.oslo.feature.home.ui.accountsnapshot.mvi.AccountSnapshotEvent.ContentLoadFailed contentLoadFailed, com.paypal.oslo.feature.home.domain.model.Section section, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                section = contentLoadFailed.errorSection;
            }
            return contentLoadFailed.copy(section);
        }
    }

    public /* synthetic */ AccountSnapshotEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
