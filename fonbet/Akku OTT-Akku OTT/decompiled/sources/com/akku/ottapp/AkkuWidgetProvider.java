package com.akku.ottapp;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.haryanvi.netstream.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/akku/ottapp/AkkuWidgetProvider;", "Lcom/akku/ottapp/BaseAkkuWidgetProvider;", "<init>", "()V", "updateWidget", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AkkuWidgetProvider extends BaseAkkuWidgetProvider {
    public static final /* synthetic */ int a = 0;

    @Override // com.akku.ottapp.BaseAkkuWidgetProvider
    public final void e(final Context context, final AppWidgetManager appWidgetManager, final int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_akku_featured);
        final SharedPreferences a2 = BaseAkkuWidgetProvider.a(context);
        String string = a2.getString("widget_featured_id", null);
        String string2 = a2.getString("widget_featured_title", null);
        final String string3 = a2.getString("widget_featured_poster", null);
        String string4 = a2.getString("widget_featured_type", null);
        BaseAkkuWidgetProvider.d(context, remoteViews);
        if (string == null || string3 == null) {
            remoteViews.setTextViewText(R.id.txt_featured_title, "Open Akku");
            appWidgetManager.updateAppWidget(i, remoteViews);
            return;
        }
        if (string2 == null) {
            string2 = "";
        }
        remoteViews.setTextViewText(R.id.txt_featured_title, string2);
        if (string4 == null) {
            string4 = "movie";
        }
        BaseAkkuWidgetProvider.c(context, remoteViews, R.id.img_featured, string4, string, 100);
        final int[] iArr = {R.id.img_trending_0, R.id.img_trending_1, R.id.img_trending_2, R.id.img_trending_3};
        for (int i2 = 0; i2 < 4; i2++) {
            String string5 = a2.getString("widget_trending_" + i2 + "_id", null);
            String string6 = a2.getString("widget_trending_" + i2 + "_type", null);
            if (string5 != null && string6 != null) {
                BaseAkkuWidgetProvider.c(context, remoteViews, iArr[i2], string6, string5, i2 + 200);
            }
        }
        appWidgetManager.updateAppWidget(i, remoteViews);
        new Thread(new Runnable(this) { // from class: com.akku.ottapp.a
            @Override // java.lang.Runnable
            public final void run() {
                Bitmap b;
                Context context2 = context;
                String str = string3;
                SharedPreferences sharedPreferences = a2;
                int[] iArr2 = iArr;
                AppWidgetManager appWidgetManager2 = appWidgetManager;
                int i3 = i;
                int i4 = AkkuWidgetProvider.a;
                try {
                    Bitmap b2 = BaseAkkuWidgetProvider.b(context2, 400, 240, str);
                    RemoteViews remoteViews2 = remoteViews;
                    if (b2 != null) {
                        remoteViews2.setImageViewBitmap(R.id.img_featured, b2);
                    }
                    for (int i5 = 0; i5 < 4; i5++) {
                        String string7 = sharedPreferences.getString("widget_trending_" + i5 + "_poster", null);
                        if (string7 != null && (b = BaseAkkuWidgetProvider.b(context2, 100, 160, string7)) != null) {
                            remoteViews2.setImageViewBitmap(iArr2[i5], b);
                        }
                    }
                    appWidgetManager2.updateAppWidget(i3, remoteViews2);
                } catch (Exception unused) {
                }
            }
        }).start();
    }
}
