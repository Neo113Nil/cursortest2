package com.dyneti.shared_interfaces;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0017\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010'\u001a\u00020\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010;\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010\u0006\u001a\u0004\b9\u0010\b\"\u0004\b:\u0010\nR$\u0010?\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010\u0006\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\n"}, d2 = {"Lcom/dyneti/shared_interfaces/DynetiNFCScanData;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "getCardBIN", "()Ljava/lang/String;", "setCardBIN", "(Ljava/lang/String;)V", "cardBIN", util.h.xy.cb.b.f1091, "getLastFourDigits", "setLastFourDigits", "lastFourDigits", "", "c", "Z", "getScanSuccessful", "()Z", "setScanSuccessful", "(Z)V", "scanSuccessful", "d", "getScanDidNotFindCard", "setScanDidNotFindCard", "scanDidNotFindCard", "e", "getCardMoved", "setCardMoved", "cardMoved", "f", "getUnrecognizedCard", "setUnrecognizedCard", "unrecognizedCard", "g", "getHasExpirationDate", "setHasExpirationDate", "hasExpirationDate", "", "h", "Ljava/util/List;", "getCardAids", "()Ljava/util/List;", "setCardAids", "(Ljava/util/List;)V", "cardAids", "", "i", "J", "getListenerActiveTime", "()J", "setListenerActiveTime", "(J)V", "listenerActiveTime", "j", "getError", "setError", "error", "k", "getCardNumber", "setCardNumber", "cardNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DynetiNFCScanData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public java.lang.String cardBIN;

    /* renamed from: b, reason: from kotlin metadata */
    public java.lang.String lastFourDigits;

    /* renamed from: c, reason: from kotlin metadata */
    public boolean scanSuccessful;

    /* renamed from: d, reason: from kotlin metadata */
    public boolean scanDidNotFindCard;

    /* renamed from: e, reason: from kotlin metadata */
    public boolean cardMoved;

    /* renamed from: f, reason: from kotlin metadata */
    public boolean unrecognizedCard;

    /* renamed from: g, reason: from kotlin metadata */
    public boolean hasExpirationDate;

    /* renamed from: h, reason: from kotlin metadata */
    public java.util.List cardAids;

    /* renamed from: i, reason: from kotlin metadata */
    public long listenerActiveTime;

    /* renamed from: j, reason: from kotlin metadata */
    public java.lang.String error;

    /* renamed from: k, reason: from kotlin metadata */
    public java.lang.String cardNumber;

    public final java.util.List<java.lang.String> getCardAids() {
        return this.cardAids;
    }

    public final java.lang.String getCardBIN() {
        return this.cardBIN;
    }

    public final boolean getCardMoved() {
        return this.cardMoved;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.String getError() {
        return this.error;
    }

    public final boolean getHasExpirationDate() {
        return this.hasExpirationDate;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final long getListenerActiveTime() {
        return this.listenerActiveTime;
    }

    public final boolean getScanDidNotFindCard() {
        return this.scanDidNotFindCard;
    }

    public final boolean getScanSuccessful() {
        return this.scanSuccessful;
    }

    public final boolean getUnrecognizedCard() {
        return this.unrecognizedCard;
    }

    public final void setCardAids(java.util.List<java.lang.String> list) {
        this.cardAids = list;
    }

    public final void setCardBIN(java.lang.String str) {
        this.cardBIN = str;
    }

    public final void setCardMoved(boolean z) {
        this.cardMoved = z;
    }

    public final void setCardNumber(java.lang.String str) {
        this.cardNumber = str;
    }

    public final void setError(java.lang.String str) {
        this.error = str;
    }

    public final void setHasExpirationDate(boolean z) {
        this.hasExpirationDate = z;
    }

    public final void setLastFourDigits(java.lang.String str) {
        this.lastFourDigits = str;
    }

    public final void setListenerActiveTime(long j) {
        this.listenerActiveTime = j;
    }

    public final void setScanDidNotFindCard(boolean z) {
        this.scanDidNotFindCard = z;
    }

    public final void setScanSuccessful(boolean z) {
        this.scanSuccessful = z;
    }

    public final void setUnrecognizedCard(boolean z) {
        this.unrecognizedCard = z;
    }
}
