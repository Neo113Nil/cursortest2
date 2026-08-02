package com.akku.ottapp;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.gms.wallet.WalletConstants;
import com.haryanvi.netstream.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/akku/ottapp/PodcastsWidgetProvider;", "Lcom/akku/ottapp/BaseAkkuWidgetProvider;", "<init>", "()V", "updateWidget", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPodcastsWidgetProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PodcastsWidgetProvider.kt\ncom/akku/ottapp/PodcastsWidgetProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
/* loaded from: classes3.dex */
public final class PodcastsWidgetProvider extends BaseAkkuWidgetProvider {
    public static final /* synthetic */ int a = 0;

    @Override // com.akku.ottapp.BaseAkkuWidgetProvider
    public final void e(final Context context, final AppWidgetManager appWidgetManager, final int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        final RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_akku_podcasts);
        final SharedPreferences a2 = BaseAkkuWidgetProvider.a(context);
        BaseAkkuWidgetProvider.d(context, remoteViews);
        String str = null;
        String string = a2.getString("widget_podcast_0_id", null);
        if (string == null) {
            appWidgetManager.updateAppWidget(i, remoteViews);
            return;
        }
        CharSequence string2 = a2.getString("widget_podcast_0_title", null);
        CharSequence string3 = a2.getString("widget_podcast_0_series", null);
        if (string2 == null) {
            string2 = "";
        }
        remoteViews.setTextViewText(R.id.podcast_main_title, string2);
        if (string3 == null) {
            string3 = "Podcast";
        }
        remoteViews.setTextViewText(R.id.podcast_main_series, string3);
        BaseAkkuWidgetProvider.c(context, remoteViews, R.id.podcast_main_card, "podcast", string, 400);
        int[] iArr = {R.id.podcast_row_0, R.id.podcast_row_1, R.id.podcast_row_2};
        final int[] iArr2 = {R.id.podcast_row_img_0, R.id.podcast_row_img_1, R.id.podcast_row_img_2};
        int[] iArr3 = {R.id.podcast_row_title_0, R.id.podcast_row_title_1, R.id.podcast_row_title_2};
        int[] iArr4 = {R.id.podcast_row_sub_0, R.id.podcast_row_sub_1, R.id.podcast_row_sub_2};
        int i2 = 0;
        while (i2 < 3) {
            String string4 = a2.getString("widget_podcast_" + i2 + "_id", str);
            CharSequence string5 = a2.getString("widget_podcast_" + i2 + "_title", str);
            String string6 = a2.getString("widget_podcast_" + i2 + "_series", str);
            String string7 = a2.getString("widget_podcast_" + i2 + "_episode", null);
            String string8 = a2.getString("widget_podcast_" + i2 + "_duration", null);
            if (string4 != null) {
                int i3 = iArr3[i2];
                if (string5 == null) {
                    string5 = "";
                }
                remoteViews.setTextViewText(i3, string5);
                StringBuilder sb = new StringBuilder();
                if (string7 != null && string7.length() != 0) {
                    sb.append("Ep ".concat(string7));
                }
                if (string8 != null && string8.length() != 0) {
                    if (sb.length() > 0) {
                        sb.append(" · ");
                    }
                    sb.append(string8);
                }
                String sb2 = sb.toString();
                int i4 = iArr4[i2];
                if (sb2.length() == 0) {
                    if (string6 == null) {
                        string6 = "";
                    }
                    sb2 = string6;
                }
                remoteViews.setTextViewText(i4, sb2);
                BaseAkkuWidgetProvider.c(context, remoteViews, iArr[i2], "podcast", string4, i2 + WalletConstants.ERROR_CODE_INVALID_TRANSACTION);
            } else {
                remoteViews.setViewVisibility(iArr[i2], 8);
            }
            i2++;
            str = null;
        }
        appWidgetManager.updateAppWidget(i, remoteViews);
        new Thread(new Runnable(a2, this, context, remoteViews, iArr2, appWidgetManager, i) { // from class: com.akku.ottapp.h
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
                Bitmap b2;
                SharedPreferences sharedPreferences = this.a;
                int[] iArr5 = this.d;
                AppWidgetManager appWidgetManager2 = this.e;
                int i5 = this.f;
                int i6 = PodcastsWidgetProvider.a;
                try {
                    String string9 = sharedPreferences.getString("widget_podcast_0_poster", null);
                    Context context2 = this.b;
                    RemoteViews remoteViews2 = this.c;
                    if (string9 != null && !StringsKt.isBlank(string9) && (b2 = BaseAkkuWidgetProvider.b(context2, 200, 200, string9)) != null) {
                        remoteViews2.setImageViewBitmap(R.id.podcast_main_img, b2);
                    }
                    for (int i7 = 0; i7 < 3; i7++) {
                        String string10 = sharedPreferences.getString("widget_podcast_" + i7 + "_poster", null);
                        if (string10 != null && !StringsKt.isBlank(string10) && (b = BaseAkkuWidgetProvider.b(context2, 80, 80, string10)) != null) {
                            remoteViews2.setImageViewBitmap(iArr5[i7], b);
                        }
                    }
                    appWidgetManager2.updateAppWidget(i5, remoteViews2);
                } catch (Exception unused) {
                }
            }
        }).start();
    }
}
