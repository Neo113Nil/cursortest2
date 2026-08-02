package org.betup.ui.fragment.support.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportFaqItem;", "", "id", "", "question", "answer", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getQuestion", "getAnswer", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportFaqItem {
    public static final int $stable = 0;
    private final String answer;
    private final String id;
    private final String question;

    public static /* synthetic */ SupportFaqItem copy$default(SupportFaqItem supportFaqItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportFaqItem.id;
        }
        if ((i & 2) != 0) {
            str2 = supportFaqItem.question;
        }
        if ((i & 4) != 0) {
            str3 = supportFaqItem.answer;
        }
        return supportFaqItem.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    public final SupportFaqItem copy(String id, String question, String answer) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new SupportFaqItem(id, question, answer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportFaqItem)) {
            return false;
        }
        SupportFaqItem supportFaqItem = (SupportFaqItem) other;
        return Intrinsics.areEqual(this.id, supportFaqItem.id) && Intrinsics.areEqual(this.question, supportFaqItem.question) && Intrinsics.areEqual(this.answer, supportFaqItem.answer);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.question.hashCode()) * 31) + this.answer.hashCode();
    }

    public String toString() {
        return "SupportFaqItem(id=" + this.id + ", question=" + this.question + ", answer=" + this.answer + ")";
    }

    public SupportFaqItem(String id, String question, String answer) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public final String getId() {
        return this.id;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getAnswer() {
        return this.answer;
    }
}
