package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class wi {

    /* renamed from: a, reason: collision with root package name */
    public static final Regex f5062a = new Regex("^market://details\\?id=(.*)$");

    public static final String a(ui uiVar) {
        List<String> groupValues;
        MatchResult matchEntire = f5062a.matchEntire(uiVar.b());
        if (matchEntire == null || (groupValues = matchEntire.getGroupValues()) == null) {
            return null;
        }
        return (String) CollectionsKt.getOrNull(groupValues, 1);
    }

    public static final ui b(ui uiVar) {
        Intrinsics.checkNotNullParameter(uiVar, "<this>");
        String a2 = a(uiVar);
        if (a2 != null) {
            String format = String.format("https://play.google.com/store/apps/details?id=%s", Arrays.copyOf(new Object[]{a2}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            ui a3 = ui.a(uiVar, format, null, false, 6, null);
            if (a3 != null) {
                return a3;
            }
        }
        return uiVar;
    }
}
