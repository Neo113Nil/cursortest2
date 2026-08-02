package org.betup.utils;

import android.text.Html;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class HTMLFormatter {
    private HTMLFormatter() {
    }

    public static void setHtmlTextIntParam(TextView textView, int paramRes, int val) {
        textView.setText(Html.fromHtml(String.format(Locale.getDefault(), "<font color='#ffcc01'>%s</font> %d", textView.getContext().getString(paramRes), Integer.valueOf(val))));
    }

    public static void setHtmlTextStringParam(TextView textView, int paramRes, String val) {
        textView.setText(Html.fromHtml(String.format(Locale.getDefault(), "<font color='#ffcc01'>%s</font> %s", textView.getContext().getString(paramRes), val)));
    }

    public static void setTextHtmlStringParam(TextView textView, int paramRes, String val) {
        textView.setText(Html.fromHtml(textView.getContext().getString(paramRes, "<font color='#ffcc01'>" + val + "</font>")));
    }
}
