package org.betup.utils;

import android.widget.TextView;

/* loaded from: classes4.dex */
public final class NameFormatter {
    private NameFormatter() {
    }

    public static String setTeamNameForList(TextView textView, String name) {
        textView.setText(name);
        if (!name.contains(" ") || name.indexOf(32) > 8) {
            textView.setMaxLines(1);
            return "";
        }
        textView.setMaxLines(2);
        return "";
    }
}
