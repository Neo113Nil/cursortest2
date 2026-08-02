package com.akku.ottapp;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.m;
import com.bumptech.glide.util.l;
import com.haryanvi.netstream.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0004J8\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0004J \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0004J*\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0004¨\u0006\u001f"}, d2 = {"Lcom/akku/ottapp/BaseAkkuWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "onUpdate", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "updateWidget", "appWidgetId", "", "getPrefs", "Landroid/content/SharedPreferences;", "setClickIntent", "views", "Landroid/widget/RemoteViews;", "viewId", "contentType", "", "contentId", "requestCode", "setLaunchAppIntent", "loadImageAsync", "Landroid/graphics/Bitmap;", "url", "width", "height", "app_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: com.akku.ottapp.b, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class BaseAkkuWidgetProvider extends AppWidgetProvider {
    public static SharedPreferences a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("HomeWidgetPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static Bitmap b(Context context, int i, int i2, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            GlideUrl glideUrl = new GlideUrl(url, new LazyHeaders.Builder().addHeader("Referer", "https://akkuott.com/").build());
            Context applicationContext = context.getApplicationContext();
            l.c(applicationContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            m b = com.bumptech.glide.b.a(applicationContext).e.b(applicationContext);
            b.getClass();
            com.bumptech.glide.l g = new com.bumptech.glide.l(b.a, b, b.b).a(m.m).v(glideUrl).g(i, i2);
            g.getClass();
            com.bumptech.glide.l lVar = (com.bumptech.glide.l) g.n(k.b, new com.bumptech.glide.load.resource.bitmap.i());
            lVar.getClass();
            com.bumptech.glide.request.g gVar = new com.bumptech.glide.request.g();
            lVar.u(gVar, gVar, com.bumptech.glide.util.e.b);
            return (Bitmap) gVar.get();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r6.equals("reel") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r6.equals("podcast") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r6.equals("tvshow") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r6.equals("tv_show") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r6.equals("livetv") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r6.equals("episode") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r6.equals("short") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
    
        r1 = "shorts";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, RemoteViews views, int i, String contentType, String contentId, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(views, "views");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        String str = "tvshow";
        switch (contentType.hashCode()) {
            case -1544438277:
                str = "episode";
                break;
            case -1102433170:
                str = "livetv";
                break;
            case -954251622:
                break;
            case -861480833:
                break;
            case -405568764:
                break;
            case 3496474:
                break;
            case 104087344:
                contentType.equals("movie");
                str = "movie";
                break;
            case 109413500:
                break;
            case 112202875:
                contentType.equals("video");
                str = "movie";
                break;
            default:
                str = "movie";
                break;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("akkuott://" + str + DomExceptionUtils.SEPARATOR + contentId));
        intent.setPackage(context.getPackageName());
        intent.addFlags(335544320);
        views.setOnClickPendingIntent(i, PendingIntent.getActivity(context, i2, intent, 201326592));
    }

    public static void d(Context context, RemoteViews views) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(views, "views");
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            views.setOnClickPendingIntent(R.id.widget_root, PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592));
        }
    }

    public abstract void e(Context context, AppWidgetManager appWidgetManager, int i);

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        for (int i : appWidgetIds) {
            e(context, appWidgetManager, i);
        }
    }
}
