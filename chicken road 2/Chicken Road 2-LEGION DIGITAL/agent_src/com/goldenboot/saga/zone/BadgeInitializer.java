package com.goldenboot.saga.zone;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import com.goldenboot.saga.zone.SpringDemux;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class BadgeInitializer {
    public static final LegacyComposer evictLayout = new LegacyComposer(2);
    public static final Comparator growPayload = new Comparator() { // from class: com.goldenboot.saga.zone.ScaleSanitizer
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return BadgeInitializer.evictLayout((byte[]) obj, (byte[]) obj2);
        }
    };

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public interface ActivityMutator {
        static ActivityMutator evictLayout(Context context, Uri uri) {
            return new BounceHandler(context, uri);
        }

        void close();

        Cursor growPayload(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler implements ActivityMutator {
        public final ContentProviderClient evictLayout;

        public BounceHandler(Context context, Uri uri) {
            this.evictLayout = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // com.goldenboot.saga.zone.BadgeInitializer.ActivityMutator
        public void close() {
            ContentProviderClient contentProviderClient = this.evictLayout;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }

        @Override // com.goldenboot.saga.zone.BadgeInitializer.ActivityMutator
        public Cursor growPayload(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.evictLayout;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class FeedbackFlow {
        public String evictLayout;
        public String growPayload;
        public List injectMetric;

        public FeedbackFlow(String str, String str2, List list) {
            this.evictLayout = str;
            this.growPayload = str2;
            this.injectMetric = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedbackFlow)) {
                return false;
            }
            FeedbackFlow feedbackFlow = (FeedbackFlow) obj;
            return Objects.equals(this.evictLayout, feedbackFlow.evictLayout) && Objects.equals(this.growPayload, feedbackFlow.growPayload) && Objects.equals(this.injectMetric, feedbackFlow.injectMetric);
        }

        public int hashCode() {
            return Objects.hash(this.evictLayout, this.growPayload, this.injectMetric);
        }
    }

    public static ProviderInfo clipOrigin(PackageManager packageManager, ClipboardPipeline clipboardPipeline, Resources resources) {
        TabSupervisor.evictLayout("FontProvider.getProvider");
        try {
            List detachStream = detachStream(clipboardPipeline, resources);
            FeedbackFlow feedbackFlow = new FeedbackFlow(clipboardPipeline.releaseHeader(), clipboardPipeline.clipOrigin(), detachStream);
            ProviderInfo providerInfo = (ProviderInfo) evictLayout.injectMetric(feedbackFlow);
            if (providerInfo != null) {
                return providerInfo;
            }
            String releaseHeader = clipboardPipeline.releaseHeader();
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(releaseHeader, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + releaseHeader);
            }
            if (!resolveContentProvider.packageName.equals(clipboardPipeline.clipOrigin())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + releaseHeader + ", but package was not " + clipboardPipeline.clipOrigin());
            }
            List growPayload2 = growPayload(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(growPayload2, growPayload);
            for (int i = 0; i < detachStream.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) detachStream.get(i));
                Collections.sort(arrayList, growPayload);
                if (injectMetric(growPayload2, arrayList)) {
                    evictLayout.detachStream(feedbackFlow, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            TabSupervisor.growPayload();
            return null;
        } finally {
            TabSupervisor.growPayload();
        }
    }

    public static List detachStream(ClipboardPipeline clipboardPipeline, Resources resources) {
        return clipboardPipeline.growPayload() != null ? clipboardPipeline.growPayload() : ConnectionCallback.injectMetric(resources, clipboardPipeline.injectMetric());
    }

    public static /* synthetic */ int evictLayout(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.goldenboot.saga.zone.BadgeInitializer$ActivityMutator] */
    public static SpringDemux.BounceHandler[] flushSample(Context context, ClipboardPipeline clipboardPipeline, String str, CancellationSignal cancellationSignal) {
        ?? r19;
        ActivityMutator activityMutator;
        ActivityMutator activityMutator2;
        Uri withAppendedId;
        TabSupervisor.evictLayout("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ActivityMutator evictLayout2 = ActivityMutator.evictLayout(context, build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                TabSupervisor.evictLayout("ContentQueryWrapper.query");
                try {
                    try {
                        cursor = evictLayout2.growPayload(build, strArr, "query = ?", new String[]{clipboardPipeline.flushSample()}, null, cancellationSignal);
                        if (cursor == null || cursor.getCount() <= 0) {
                            activityMutator = evictLayout2;
                        } else {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                if (columnIndex3 == -1) {
                                    activityMutator2 = evictLayout2;
                                    withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                } else {
                                    activityMutator2 = evictLayout2;
                                    withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                }
                                arrayList2.add(new SpringDemux.BounceHandler(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, clipboardPipeline.applyTask(), i));
                                evictLayout2 = activityMutator2;
                            }
                            activityMutator = evictLayout2;
                            arrayList = arrayList2;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        activityMutator.close();
                        return (SpringDemux.BounceHandler[]) arrayList.toArray(new SpringDemux.BounceHandler[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    r19 = context;
                    if (cursor != null) {
                        cursor.close();
                    }
                    r19.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r19 = evictLayout2;
            }
        } finally {
            TabSupervisor.growPayload();
        }
    }

    public static List growPayload(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean injectMetric(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static SpringDemux.ActivityMutator releaseHeader(Context context, List list, CancellationSignal cancellationSignal) {
        String updateTimer;
        Typeface updateTimer2;
        TabSupervisor.evictLayout("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ClipboardPipeline clipboardPipeline = (ClipboardPipeline) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (updateTimer2 = ContentInjector.updateTimer((updateTimer = clipboardPipeline.updateTimer()))) == null || ContentInjector.popBlueprint(updateTimer2) == null) {
                    ProviderInfo clipOrigin = clipOrigin(context.getPackageManager(), clipboardPipeline, context.getResources());
                    if (clipOrigin == null) {
                        return SpringDemux.ActivityMutator.growPayload(1, null);
                    }
                    arrayList.add(flushSample(context, clipboardPipeline, clipOrigin.authority, cancellationSignal));
                } else {
                    arrayList.add(new SpringDemux.BounceHandler[]{new SpringDemux.BounceHandler(updateTimer, clipboardPipeline.applyTask())});
                }
            }
            return SpringDemux.ActivityMutator.evictLayout(0, arrayList);
        } finally {
            TabSupervisor.growPayload();
        }
    }
}
