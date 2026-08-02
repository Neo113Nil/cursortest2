package com.dyneti.shared_interfaces;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/dyneti/shared_interfaces/DynetiNFCCard;", "Landroid/os/Parcelable;", "", "getCardNumber", "()Ljava/lang/String;", "setCardNumber", "(Ljava/lang/String;)V", "cardNumber", "getName", "setName", "name", "getExpirationMonth", "setExpirationMonth", "expirationMonth", "getExpirationYear", "setExpirationYear", "expirationYear"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DynetiNFCCard extends android.os.Parcelable {
    java.lang.String getCardNumber();

    java.lang.String getExpirationMonth();

    java.lang.String getExpirationYear();

    java.lang.String getName();

    void setCardNumber(java.lang.String str);

    void setExpirationMonth(java.lang.String str);

    void setExpirationYear(java.lang.String str);

    void setName(java.lang.String str);
}
