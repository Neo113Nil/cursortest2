package org.betup.ui.fragment.support.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010 \u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006$"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportFeedbackState;", "", "types", "", "", "selectedTypeIndex", "", "email", "prefilledMessage", "isSending", "", "isSent", "errorMessage", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getTypes", "()Ljava/util/List;", "getSelectedTypeIndex", "()I", "getEmail", "()Ljava/lang/String;", "getPrefilledMessage", "()Z", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportFeedbackState {
    public static final int $stable = 0;
    private final String email;
    private final String errorMessage;
    private final boolean isSending;
    private final boolean isSent;
    private final String prefilledMessage;
    private final int selectedTypeIndex;
    private final List<String> types;

    public SupportFeedbackState() {
        this(null, 0, null, null, false, false, null, 127, null);
    }

    public static /* synthetic */ SupportFeedbackState copy$default(SupportFeedbackState supportFeedbackState, List list, int i, String str, String str2, boolean z, boolean z2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = supportFeedbackState.types;
        }
        if ((i2 & 2) != 0) {
            i = supportFeedbackState.selectedTypeIndex;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = supportFeedbackState.email;
        }
        String str4 = str;
        if ((i2 & 8) != 0) {
            str2 = supportFeedbackState.prefilledMessage;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            z = supportFeedbackState.isSending;
        }
        boolean z3 = z;
        if ((i2 & 32) != 0) {
            z2 = supportFeedbackState.isSent;
        }
        boolean z4 = z2;
        if ((i2 & 64) != 0) {
            str3 = supportFeedbackState.errorMessage;
        }
        return supportFeedbackState.copy(list, i3, str4, str5, z3, z4, str3);
    }

    public final List<String> component1() {
        return this.types;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedTypeIndex() {
        return this.selectedTypeIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrefilledMessage() {
        return this.prefilledMessage;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSent() {
        return this.isSent;
    }

    /* renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final SupportFeedbackState copy(List<String> types, int selectedTypeIndex, String email, String prefilledMessage, boolean isSending, boolean isSent, String errorMessage) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(prefilledMessage, "prefilledMessage");
        return new SupportFeedbackState(types, selectedTypeIndex, email, prefilledMessage, isSending, isSent, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportFeedbackState)) {
            return false;
        }
        SupportFeedbackState supportFeedbackState = (SupportFeedbackState) other;
        return Intrinsics.areEqual(this.types, supportFeedbackState.types) && this.selectedTypeIndex == supportFeedbackState.selectedTypeIndex && Intrinsics.areEqual(this.email, supportFeedbackState.email) && Intrinsics.areEqual(this.prefilledMessage, supportFeedbackState.prefilledMessage) && this.isSending == supportFeedbackState.isSending && this.isSent == supportFeedbackState.isSent && Intrinsics.areEqual(this.errorMessage, supportFeedbackState.errorMessage);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.types.hashCode() * 31) + Integer.hashCode(this.selectedTypeIndex)) * 31) + this.email.hashCode()) * 31) + this.prefilledMessage.hashCode()) * 31) + Boolean.hashCode(this.isSending)) * 31) + Boolean.hashCode(this.isSent)) * 31;
        String str = this.errorMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SupportFeedbackState(types=" + this.types + ", selectedTypeIndex=" + this.selectedTypeIndex + ", email=" + this.email + ", prefilledMessage=" + this.prefilledMessage + ", isSending=" + this.isSending + ", isSent=" + this.isSent + ", errorMessage=" + this.errorMessage + ")";
    }

    public SupportFeedbackState(List<String> types, int i, String email, String prefilledMessage, boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(prefilledMessage, "prefilledMessage");
        this.types = types;
        this.selectedTypeIndex = i;
        this.email = email;
        this.prefilledMessage = prefilledMessage;
        this.isSending = z;
        this.isSent = z2;
        this.errorMessage = str;
    }

    public /* synthetic */ SupportFeedbackState(List list, int i, String str, String str2, boolean z, boolean z2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str, (i2 & 8) == 0 ? str2 : "", (i2 & 16) != 0 ? false : z, (i2 & 32) == 0 ? z2 : false, (i2 & 64) != 0 ? null : str3);
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final int getSelectedTypeIndex() {
        return this.selectedTypeIndex;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPrefilledMessage() {
        return this.prefilledMessage;
    }

    public final boolean isSending() {
        return this.isSending;
    }

    public final boolean isSent() {
        return this.isSent;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
