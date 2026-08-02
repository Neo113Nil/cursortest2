package com.facetec.sdk;

/* loaded from: classes8.dex */
final class gq extends com.facetec.sdk.fd<java.sql.Date> {
    static final com.facetec.sdk.fb d = new com.facetec.sdk.fb() { // from class: com.facetec.sdk.gq.3
        @Override // com.facetec.sdk.fb
        public final <T> com.facetec.sdk.fd<T> d(com.facetec.sdk.eo eoVar, com.facetec.sdk.gw<T> gwVar) {
            if (gwVar.a() == java.sql.Date.class) {
                return new com.facetec.sdk.gq((byte) 0);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final java.text.DateFormat f3613a;

    /* synthetic */ gq(byte b) {
        this();
    }

    @Override // com.facetec.sdk.fd
    public final /* synthetic */ void a(com.facetec.sdk.gu guVar, java.sql.Date date) throws java.io.IOException {
        java.lang.String format;
        java.sql.Date date2 = date;
        if (date2 == null) {
            guVar.g();
            return;
        }
        synchronized (this) {
            format = this.f3613a.format((java.util.Date) date2);
        }
        guVar.d(format);
    }

    private gq() {
        this.f3613a = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facetec.sdk.fd
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public java.sql.Date b(com.facetec.sdk.gt gtVar) throws java.io.IOException {
        java.util.Date parse;
        if (gtVar.f() == com.facetec.sdk.gs.NULL) {
            gtVar.k();
            return null;
        }
        java.lang.String g = gtVar.g();
        try {
            synchronized (this) {
                parse = this.f3613a.parse(g);
            }
            return new java.sql.Date(parse.getTime());
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed parsing '");
            sb.append(g);
            sb.append("' as SQL Date; at path ");
            sb.append(gtVar.s());
            throw new com.facetec.sdk.ev(sb.toString(), e);
        }
    }
}
