package p000;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052b7 {
    /* JADX INFO: renamed from: a */
    public static LocaleList m598a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m599b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
