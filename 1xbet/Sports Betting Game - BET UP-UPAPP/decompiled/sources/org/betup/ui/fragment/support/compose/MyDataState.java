package org.betup.ui.fragment.support.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000e¨\u0006\""}, d2 = {"Lorg/betup/ui/fragment/support/compose/MyDataState;", "", "isLoading", "", "hasActiveRequest", "email", "", "message", "isSending", "isCancelling", "errorMessage", "isGuest", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Z)V", "()Z", "getHasActiveRequest", "getEmail", "()Ljava/lang/String;", "getMessage", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MyDataState {
    public static final int $stable = 0;
    private final String email;
    private final String errorMessage;
    private final boolean hasActiveRequest;
    private final boolean isCancelling;
    private final boolean isGuest;
    private final boolean isLoading;
    private final boolean isSending;
    private final String message;

    public MyDataState() {
        this(false, false, null, null, false, false, null, false, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasActiveRequest() {
        return this.hasActiveRequest;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCancelling() {
        return this.isCancelling;
    }

    /* renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsGuest() {
        return this.isGuest;
    }

    public final MyDataState copy(boolean isLoading, boolean hasActiveRequest, String email, String message, boolean isSending, boolean isCancelling, String errorMessage, boolean isGuest) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(message, "message");
        return new MyDataState(isLoading, hasActiveRequest, email, message, isSending, isCancelling, errorMessage, isGuest);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyDataState)) {
            return false;
        }
        MyDataState myDataState = (MyDataState) other;
        return this.isLoading == myDataState.isLoading && this.hasActiveRequest == myDataState.hasActiveRequest && Intrinsics.areEqual(this.email, myDataState.email) && Intrinsics.areEqual(this.message, myDataState.message) && this.isSending == myDataState.isSending && this.isCancelling == myDataState.isCancelling && Intrinsics.areEqual(this.errorMessage, myDataState.errorMessage) && this.isGuest == myDataState.isGuest;
    }

    public int hashCode() {
        int hashCode = ((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.hasActiveRequest)) * 31) + this.email.hashCode()) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.isSending)) * 31) + Boolean.hashCode(this.isCancelling)) * 31;
        String str = this.errorMessage;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isGuest);
    }

    public String toString() {
        return "MyDataState(isLoading=" + this.isLoading + ", hasActiveRequest=" + this.hasActiveRequest + ", email=" + this.email + ", message=" + this.message + ", isSending=" + this.isSending + ", isCancelling=" + this.isCancelling + ", errorMessage=" + this.errorMessage + ", isGuest=" + this.isGuest + ")";
    }

    public MyDataState(boolean z, boolean z2, String email, String message, boolean z3, boolean z4, String str, boolean z5) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(message, "message");
        this.isLoading = z;
        this.hasActiveRequest = z2;
        this.email = email;
        this.message = message;
        this.isSending = z3;
        this.isCancelling = z4;
        this.errorMessage = str;
        this.isGuest = z5;
    }

    public /* synthetic */ MyDataState(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? z5 : false);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getHasActiveRequest() {
        return this.hasActiveRequest;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean isSending() {
        return this.isSending;
    }

    public final boolean isCancelling() {
        return this.isCancelling;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isGuest() {
        return this.isGuest;
    }
}
