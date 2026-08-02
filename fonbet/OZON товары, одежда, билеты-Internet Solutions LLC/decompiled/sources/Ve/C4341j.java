package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;

/* renamed from: Ve.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4341j {

    /* renamed from: a, reason: collision with root package name */
    public final String f31328a;

    /* renamed from: b, reason: collision with root package name */
    public final ListOfCardsRequestBody f31329b;

    public C4341j(String authorization, ListOfCardsRequestBody listOfCardsRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(listOfCardsRequestBody, "listOfCardsRequestBody");
        this.f31328a = authorization;
        this.f31329b = listOfCardsRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4341j)) {
            return false;
        }
        C4341j c4341j = (C4341j) obj;
        return Intrinsics.d(this.f31328a, c4341j.f31328a) && Intrinsics.d(this.f31329b, c4341j.f31329b);
    }

    public final int hashCode() {
        return this.f31329b.hashCode() + (this.f31328a.hashCode() * 31);
    }

    public final String toString() {
        return "GetListOfCardsUseCaseRequestParams(authorization=" + this.f31328a + ", listOfCardsRequestBody=" + this.f31329b + ")";
    }
}
