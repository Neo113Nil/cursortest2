package com.akku.ottapp;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.haryanvi.netstream.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/akku/ottapp/ReelsWidgetProvider;", "Lcom/akku/ottapp/BaseAkkuWidgetProvider;", "<init>", "()V", "updateWidget", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReelsWidgetProvider extends BaseAkkuWidgetProvider {
    public static final /* synthetic */ int a = 0;

    @Override // com.akku.ottapp.BaseAkkuWidgetProvider
    public final void e(final Context context, final AppWidgetManager appWidgetManager, final int i) {
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        final RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.widget_akku_reels);
        final SharedPreferences a2 = BaseAkkuWidgetProvider.a(context2);
        BaseAkkuWidgetProvider.d(context2, remoteViews);
        if (a2.getString("widget_reel_0_id", null) == null) {
            appWidgetManager.updateAppWidget(i, remoteViews);
            return;
        }
        int[] iArr = {R.id.reel_card_0, R.id.reel_card_1, R.id.reel_card_2};
        final int[] iArr2 = {R.id.reel_img_0, R.id.reel_img_1, R.id.reel_img_2};
        int[] iArr3 = {R.id.reel_title_0, R.id.reel_title_1, R.id.reel_title_2};
        int[] iArr4 = {R.id.reel_duration_0, R.id.reel_duration_1, R.id.reel_duration_2};
        int i2 = 0;
        while (i2 < 3) {
            String string = a2.getString("widget_reel_" + i2 + "_id", null);
            String string2 = a2.getString("widget_reel_" + i2 + "_title", null);
            String string3 = a2.getString("widget_reel_" + i2 + "_duration", null);
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
                BaseAkkuWidgetProvider.c(context2, remoteViews, iArr[i2], "reel", string, i2 + 300);
            } else {
                remoteViews.setViewVisibility(iArr[i2], 8);
            }
            i2++;
            context2 = context;
        }
        appWidgetManager.updateAppWidget(i, remoteViews);
        new Thread(new Runnable(a2, this, context, remoteViews, iArr2, appWidgetManager, i) { // from class: com.akku.ottapp.i
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
                SharedPreferences sharedPreferences = this.a;
                Context context3 = this.b;
                int[] iArr5 = this.d;
                AppWidgetManager appWidgetManager2 = this.e;
                int i5 = this.f;
                int i6 = ReelsWidgetProvider.a;
                int i7 = 0;
                while (true) {
                    RemoteViews remoteViews2 = this.c;
                    if (i7 >= 3) {
                        appWidgetManager2.updateAppWidget(i5, remoteViews2);
                        return;
                    }
                    try {
                        String string4 = sharedPreferences.getString("widget_reel_" + i7 + "_poster", null);
                        if (string4 != null && !StringsKt.isBlank(string4)) {
                            Bitmap b = BaseAkkuWidgetProvider.b(context3, 200, 356, string4);
                            if (b != null) {
                                b.getWidth();
                            }
                            if (b != null) {
                                b.getHeight();
                            }
                            if (b != null) {
                                remoteViews2.setImageViewBitmap(iArr5[i7], b);
                            }
                        }
                        i7++;
                    } catch (Exception unused) {
                        return;
                    }
                    return;
                }
            }
        }).start();
    }
}
