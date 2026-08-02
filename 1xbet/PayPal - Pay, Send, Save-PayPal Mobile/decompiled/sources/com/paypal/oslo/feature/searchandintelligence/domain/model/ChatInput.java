package com.paypal.oslo.feature.searchandintelligence.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "", "Text", "Action", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput$Action;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ChatInput {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput$Text;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput$Text;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Text implements com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput {
        public static final int $stable = 0;
        private final java.lang.String text;

        public Text(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.text = str;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Text(text=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text) other).text);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text copy(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text(text);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Text text, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput$Action;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_CONTENT_KEY, "<init>", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)V", "component1", "()Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "copy", "(Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;)Lcom/paypal/oslo/feature/searchandintelligence/domain/model/ChatInput$Action;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/ActionContent;", "getActionContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Action implements com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput {
        public static final int $stable = com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent.$stable;
        private final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent;

        public Action(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            this.actionContent = actionContent;
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent = this.actionContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(actionContent=");
            sb.append(actionContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionContent, ((com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action) other).actionContent);
        }

        public final com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action copy(com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionContent, "");
            return new com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action(actionContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent getActionContent() {
            return this.actionContent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action copy$default(com.paypal.oslo.feature.searchandintelligence.domain.model.ChatInput.Action action, com.paypal.oslo.feature.searchandintelligence.api.domain.ActionContent actionContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                actionContent = action.actionContent;
            }
            return action.copy(actionContent);
        }
    }
}
