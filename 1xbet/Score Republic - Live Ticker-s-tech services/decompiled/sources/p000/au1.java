package p000;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class au1 extends d12 {

    /* JADX INFO: renamed from: l */
    public long f639l;

    /* JADX INFO: renamed from: m */
    public String f640m;

    @Override // p000.d12
    /* JADX INFO: renamed from: B */
    public final boolean mo0B() {
        Calendar calendar = Calendar.getInstance();
        this.f639l = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f640m = AbstractC0024an.m286i(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final long m485E() {
        m1081C();
        return this.f639l;
    }

    /* JADX INFO: renamed from: F */
    public final String m486F() {
        m1081C();
        return this.f640m;
    }
}
