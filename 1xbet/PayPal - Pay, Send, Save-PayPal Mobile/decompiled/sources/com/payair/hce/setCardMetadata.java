package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCardMetadata extends com.payair.hce.Record {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static long values = -4603739655531115026L;
    private static int writeReplace;

    @Override // com.payair.hce.Record
    public final java.util.List<com.payair.hce.resetAuthenticationReferences> valueOf(com.payair.hce.access202 access202Var) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (access202Var.writeReplace() == com.payair.hce.activateCardForToken.writeReplace) {
            int i = AlternateContactlessPaymentDataJson + 23;
            writeReplace = i % 128;
            if (i % 2 == 0) {
                if (!values((com.payair.hce.access000) access202Var)) {
                    arrayList.add(com.payair.hce.resetAuthenticationReferences.writeReplace);
                    AlternateContactlessPaymentDataJson = (writeReplace + 81) % 128;
                }
            } else {
                values((com.payair.hce.access000) access202Var);
                throw new java.lang.ArithmeticException();
            }
        }
        return arrayList;
    }

    private boolean values(com.payair.hce.access000 access000Var) {
        com.payair.hce.access400 access400Var = (com.payair.hce.access400) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -2078363504, 2078363507, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.onReplenishFailed mchipCvmIssuerOptions = com.payair.hce.access000.getMchipCvmIssuerOptions();
        if (mchipCvmIssuerOptions != null) {
            AlternateContactlessPaymentDataJson = (writeReplace + 119) % 128;
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.valueOf;
            android.view.KeyEvent.keyCodeFromString("");
            new java.lang.Object[]{mchipCvmIssuerOptions.DigitizedCardProfile().getAid(), mchipCvmIssuerOptions.writeReplace().getAid(), java.lang.Boolean.valueOf(mchipCvmIssuerOptions.values())};
            try {
                long longValue = ((com.payair.hce.provisionFromLocalStorage) com.payair.hce.access400.writeReplace(new java.lang.Object[]{access400Var}, 1737569389, -1737569387, java.lang.System.identityHashCode(access400Var))).getAid().longValue();
                java.lang.String aid = access400Var.valueOf().getAid();
                boolean valueOf = ((com.payair.hce.requestChangePin) ((com.payair.hce.requestSetWalletPin) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, 857149142, -857149112, java.lang.System.identityHashCode(access000Var)))).valueOf();
                if (mchipCvmIssuerOptions.DigitizedCardProfile().getAid().longValue() == longValue && mchipCvmIssuerOptions.writeReplace().getAid().equals(aid)) {
                    AlternateContactlessPaymentDataJson = (writeReplace + 117) % 128;
                    if (mchipCvmIssuerOptions.values() == valueOf) {
                        return true;
                    }
                }
                com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.valueOf;
                android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                java.lang.Long.valueOf(longValue);
                java.lang.Boolean.valueOf(valueOf);
            } catch (com.payair.hce.getSetPinRequestData unused) {
            }
            return false;
        }
        writeReplace = (AlternateContactlessPaymentDataJson + 9) % 128;
        return true;
    }

    public static int i(int i) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
            if (obj == null) {
                obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 46, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (46337 - android.view.Gravity.getAbsoluteGravity(0, 0)))).getMethod("x", java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj);
            }
            return ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr)).intValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
