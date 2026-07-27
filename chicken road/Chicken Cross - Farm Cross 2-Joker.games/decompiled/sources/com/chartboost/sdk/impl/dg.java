package com.chartboost.sdk.impl;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class dg {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f4735a;

    public dg(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f4735a = resources;
    }

    public final String a(int i) {
        try {
            InputStream openRawResource = this.f4735a.openRawResource(i);
            try {
                Intrinsics.checkNotNull(openRawResource);
                Reader inputStreamReader = new InputStreamReader(openRawResource, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String readText = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(openRawResource, null);
                    return readText;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            mb.b("Raw resource file exception", e);
            return null;
        }
    }
}
