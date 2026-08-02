package org.betup.ui.fragment.support.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportFaqState;", "", "isLoading", "", "items", "", "Lorg/betup/ui/fragment/support/compose/SupportFaqItem;", "errorMessage", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZLjava/util/List;Ljava/lang/String;)V", "()Z", "getItems", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportFaqState {
    public static final int $stable = 0;
    private final String errorMessage;
    private final boolean isLoading;
    private final List<SupportFaqItem> items;

    public SupportFaqState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportFaqState copy$default(SupportFaqState supportFaqState, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = supportFaqState.isLoading;
        }
        if ((i & 2) != 0) {
            list = supportFaqState.items;
        }
        if ((i & 4) != 0) {
            str = supportFaqState.errorMessage;
        }
        return supportFaqState.copy(z, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<SupportFaqItem> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final SupportFaqState copy(boolean isLoading, List<SupportFaqItem> items, String errorMessage) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new SupportFaqState(isLoading, items, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportFaqState)) {
            return false;
        }
        SupportFaqState supportFaqState = (SupportFaqState) other;
        return this.isLoading == supportFaqState.isLoading && Intrinsics.areEqual(this.items, supportFaqState.items) && Intrinsics.areEqual(this.errorMessage, supportFaqState.errorMessage);
    }

    public int hashCode() {
        int hashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.items.hashCode()) * 31;
        String str = this.errorMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SupportFaqState(isLoading=" + this.isLoading + ", items=" + this.items + ", errorMessage=" + this.errorMessage + ")";
    }

    public SupportFaqState(boolean z, List<SupportFaqItem> items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.isLoading = z;
        this.items = items;
        this.errorMessage = str;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ SupportFaqState(boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str);
    }

    public final List<SupportFaqItem> getItems() {
        return this.items;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
