package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.request.ListOfCardsRequestBody;
import spay.sdk.domain.model.request.SdkAuthRequestBody;

/* renamed from: Ve.ko, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4395ko {

    /* renamed from: a, reason: collision with root package name */
    public final String f31469a;

    /* renamed from: b, reason: collision with root package name */
    public final Io f31470b;

    /* renamed from: c, reason: collision with root package name */
    public final ListOfCardsRequestBody f31471c;

    /* renamed from: d, reason: collision with root package name */
    public final SdkAuthRequestBody f31472d;

    public C4395ko(String authorization, Io cardSelectionData, ListOfCardsRequestBody listOfCardsRequestBody, SdkAuthRequestBody sdkAuthRequestBody) {
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(cardSelectionData, "cardSelectionData");
        this.f31469a = authorization;
        this.f31470b = cardSelectionData;
        this.f31471c = listOfCardsRequestBody;
        this.f31472d = sdkAuthRequestBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4395ko)) {
            return false;
        }
        C4395ko c4395ko = (C4395ko) obj;
        return Intrinsics.d(this.f31469a, c4395ko.f31469a) && Intrinsics.d(this.f31470b, c4395ko.f31470b) && Intrinsics.d(this.f31471c, c4395ko.f31471c) && Intrinsics.d(this.f31472d, c4395ko.f31472d);
    }

    public final int hashCode() {
        int hashCode = (this.f31470b.f29244a.hashCode() + (this.f31469a.hashCode() * 31)) * 31;
        ListOfCardsRequestBody listOfCardsRequestBody = this.f31471c;
        int hashCode2 = (hashCode + (listOfCardsRequestBody == null ? 0 : listOfCardsRequestBody.hashCode())) * 31;
        SdkAuthRequestBody sdkAuthRequestBody = this.f31472d;
        return hashCode2 + (sdkAuthRequestBody != null ? sdkAuthRequestBody.hashCode() : 0);
    }

    public final String toString() {
        return "GetFullEmissionUseCaseRequestParams(authorization=" + this.f31469a + ", cardSelectionData=" + this.f31470b + ", listOfCardsRequestBody=" + this.f31471c + ", sdkAuthRequestBody=" + this.f31472d + ")";
    }
}
