package com.akku.ottapp;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.haryanvi.netstream.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/akku/ottapp/ComingSoonWidgetProvider;", "Lcom/akku/ottapp/BaseAkkuWidgetProvider;", "<init>", "()V", "updateWidget", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComingSoonWidgetProvider extends BaseAkkuWidgetProvider {
    public static final /* synthetic */ int a = 0;

    @Override // com.akku.ottapp.BaseAkkuWidgetProvider
    public final void e(final Context context, final AppWidgetManager appWidgetManager, final int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_akku_coming_soon);
        final SharedPreferences a2 = BaseAkkuWidgetProvider.a(context);
        BaseAkkuWidgetProvider.d(context, remoteViews);
        String str = null;
        if (a2.getString("widget_coming_0_id", null) == null) {
            appWidgetManager.updateAppWidget(i, remoteViews);
            return;
        }
        int[] iArr = {R.id.coming_card_0, R.id.coming_card_1, R.id.coming_card_2};
        final int[] iArr2 = {R.id.coming_img_0, R.id.coming_img_1, R.id.coming_img_2};
        int[] iArr3 = {R.id.coming_name_0, R.id.coming_name_1, R.id.coming_name_2};
        int[] iArr4 = {R.id.coming_date_0, R.id.coming_date_1, R.id.coming_date_2};
        int[] iArr5 = {R.id.coming_genre_0, R.id.coming_genre_1, R.id.coming_genre_2};
        int i2 = 0;
        while (i2 < 3) {
            String string = a2.getString("widget_coming_" + i2 + "_id", str);
            String string2 = a2.getString("widget_coming_" + i2 + "_name", str);
            String string3 = a2.getString("widget_coming_" + i2 + "_release", null);
            String string4 = a2.getString("widget_coming_" + i2 + "_type", null);
            String string5 = a2.getString("widget_coming_" + i2 + "_genres", null);
            if (string != null) {
                int i3 = iArr3[i2];
                if (string2 == null) {
                    string2 = "";
                }
                remoteViews.setTextViewText(i3, string2);
                int i4 = iArr4[i2];
                if (string3 == null) {
                    string3 = "";
                }
                remoteViews.setTextViewText(i4, string3);
                int i5 = iArr5[i2];
                if (string5 == null) {
                    string5 = "";
                }
                remoteViews.setTextViewText(i5, string5);
                int i6 = iArr[i2];
                if (string4 == null) {
                    string4 = "movie";
                }
                BaseAkkuWidgetProvider.c(context, remoteViews, i6, string4, string, i2 + 500);
            } else {
                remoteViews.setViewVisibility(iArr[i2], 8);
            }
            i2++;
            str = null;
        }
        appWidgetManager.updateAppWidget(i, remoteViews);
        new Thread(new Runnable(a2, this, context, remoteViews, iArr2, appWidgetManager, i) { // from class: com.akku.ottapp.c
            public final /* synthetic */ SharedPreferences a;
            public final /* synthetic */ Context b;
            public final /* synthetic */ RemoteViews c;
            public final /* synthetic */ int[] d;
            public final /* synthetic */ AppWidgetManager e;
            public final /* synthetic */ int f;

            {
                this.b = context;
                this.c = remoteViews;
                this.d = iArr2;
                this.e = appWidgetManager;
                this.f = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Bitmap b;
                SharedPreferences sharedPreferences = this.a;
                Context context2 = this.b;
                int[] iArr6 = this.d;
                AppWidgetManager appWidgetManager2 = this.e;
                int i7 = this.f;
                int i8 = ComingSoonWidgetProvider.a;
                int i9 = 0;
                while (true) {
                    RemoteViews remoteViews2 = this.c;
                    if (i9 >= 3) {
                        appWidgetManager2.updateAppWidget(i7, remoteViews2);
                        return;
                    }
                    try {
                        String string6 = sharedPreferences.getString("widget_coming_" + i9 + "_poster", null);
                        if (string6 != null && (b = BaseAkkuWidgetProvider.b(context2, 160, 240, string6)) != null) {
                            remoteViews2.setImageViewBitmap(iArr6[i9], b);
                        }
                        i9++;
                    } catch (Exception unused) {
                        return;
                    }
                    return;
                }
            }
        }).start();
    }
}
