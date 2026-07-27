package com.chartboost.sdk.impl;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class kc {

    /* renamed from: a, reason: collision with root package name */
    public static final kc f4842a = new kc();

    public final Long a() {
        Object m8079constructorimpl;
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(System.getProperty("CB_AUTO_DISMISS_FULLSCREEN_ADS_DELAY"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        String str = (String) m8079constructorimpl;
        if (str == null) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                obj = Result.m8079constructorimpl(System.getenv("CB_AUTO_DISMISS_FULLSCREEN_ADS_DELAY"));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                obj = Result.m8079constructorimpl(ResultKt.createFailure(th2));
            }
            str = (String) (Result.m8085isFailureimpl(obj) ? null : obj);
        }
        return a(str);
    }

    public final Long a(String str) {
        Double doubleOrNull;
        if (str != null && (doubleOrNull = StringsKt.toDoubleOrNull(str)) != null) {
            if (doubleOrNull.doubleValue() <= 0.0d) {
                doubleOrNull = null;
            }
            if (doubleOrNull != null) {
                return Long.valueOf((long) (doubleOrNull.doubleValue() * 1000.0d));
            }
        }
        return null;
    }
}
