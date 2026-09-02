package com.goldenboot.saga.zone;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.goldenboot.saga.zone.AttrSemaphore;
import com.goldenboot.saga.zone.generated.StringDecryptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class PrimaryWriter {
    public static final int connectPatch;
    public final LayoutSynthesizer applyTask;
    public final LayoutSynthesizer clipOrigin;
    public ElevationNode connectJob;
    public ProgressBar detachStream;
    public ImageEvent drawField;
    public final Activity evictLayout;
    public final LayoutSynthesizer flushSample;
    public final List growPayload;
    public FrameLayout injectMetric;
    public int notifyMessage;
    public boolean peekRevision;
    public Object popBlueprint;
    public boolean reduceScope;
    public final LayoutSynthesizer releaseHeader;
    public String serializeOffset;
    public final LayoutSynthesizer updateTimer;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class ActivityMutator extends WebChromeClient {
        private final FrameLayout container;
        final /* synthetic */ PrimaryWriter this$0;

        public ActivityMutator(PrimaryWriter primaryWriter, FrameLayout frameLayout) {
            System.nanoTime();
            Intrinsics.checkNotNullParameter(frameLayout, StringDecryptor.decrypt(2518960788L) + StringDecryptor.decrypt(19614485715L) + StringDecryptor.decrypt(41004977938L));
            this.this$0 = primaryWriter;
            this.container = frameLayout;
        }

        private boolean checkCondition(String str, String str2) {
            System.nanoTime();
            return (str == null || str.isEmpty() || str2 == null || str.length() + str2.length() >= 256) ? false : true;
        }

        private int filterItems(int i, int i2) {
            System.nanoTime();
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (i * 31) + i3;
                i = i4 ^ (i4 >>> 16);
            }
            return i;
        }

        private String formatOutput(int i) {
            System.nanoTime();
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? StringDecryptor.decrypt(212213259979L) : StringDecryptor.decrypt(186527800460L) : StringDecryptor.decrypt(160842340941L) : StringDecryptor.decrypt(126566946830L) : StringDecryptor.decrypt(105176454607L);
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            System.nanoTime();
            Intrinsics.checkNotNullParameter(webView, StringDecryptor.decrypt(75196027792L));
            PrimaryWriter.popBlueprint(this.this$0, webView);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            System.nanoTime();
            Intrinsics.checkNotNullParameter(webView, StringDecryptor.decrypt(53805535569L));
            return PrimaryWriter.drawField(this.this$0, this.container, message);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            System.nanoTime();
            PrimaryWriter.reduceScope(this.this$0, i);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            System.nanoTime();
            return PrimaryWriter.connectJob(this.this$0, valueCallback, fileChooserParams);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class BounceHandler extends WebViewClient {
        private final Context ctx;
        final /* synthetic */ PrimaryWriter this$0;

        public BounceHandler(PrimaryWriter primaryWriter, Context context) {
            System.nanoTime();
            Intrinsics.checkNotNullParameter(context, StringDecryptor.decrypt(246488654090L));
            this.this$0 = primaryWriter;
            this.ctx = context;
        }

        private String buildResult(String str) {
            System.nanoTime();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) (str.charAt(i) ^ 31));
            }
            return sb.toString();
        }

        private int filterItems(int i, int i2) {
            System.nanoTime();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    i3 += (i5 * i4) & LayoutMap.flushSample;
                }
            }
            return i3;
        }

        private int verifyToken(int i, int i2) {
            System.nanoTime();
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    i3 += (i5 * i4) & LayoutMap.flushSample;
                }
            }
            return i3;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            System.nanoTime();
            PrimaryWriter.peekRevision(this.this$0, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            System.nanoTime();
            PrimaryWriter.serializeOffset(this.this$0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Uri url;
            System.nanoTime();
            PrimaryWriter primaryWriter = this.this$0;
            boolean z = false;
            String str = null;
            int intValue = webResourceError != null ? ((Integer) Class.forName("android.webkit.WebResourceError").getMethod("getErrorCode", null).invoke(webResourceError, null)).intValue() : 0;
            if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                z = true;
            }
            if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
                str = url.toString();
            }
            PrimaryWriter.notifyMessage(primaryWriter, webView, intValue, z, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            System.nanoTime();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            System.nanoTime();
            Intrinsics.checkNotNullParameter(webView, StringDecryptor.decrypt(53805535569L));
            Intrinsics.checkNotNullParameter(webResourceRequest, StringDecryptor.decrypt(263584179017L));
            PrimaryWriter primaryWriter = this.this$0;
            String uri = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(uri, StringDecryptor.decrypt(297859573128L) + StringDecryptor.decrypt(327839999943L) + StringDecryptor.decrypt(357820426758L));
            return PrimaryWriter.connectPatch(primaryWriter, webView, uri);
        }
    }

    static {
        System.nanoTime();
        connectPatch = 8;
    }

    public PrimaryWriter(Activity activity) {
        System.nanoTime();
        Intrinsics.checkNotNullParameter(activity, StringDecryptor.decrypt(2215426069690L) + StringDecryptor.decrypt(2236816561913L) + StringDecryptor.decrypt(1877304472904L));
        this.evictLayout = activity;
        this.growPayload = new ArrayList();
        this.releaseHeader = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.PulseLoader
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                Class computeTarget;
                computeTarget = PrimaryWriter.computeTarget();
                return computeTarget;
            }
        });
        this.clipOrigin = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.BadgeMeter
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                Class resetDelta;
                resetDelta = PrimaryWriter.resetDelta();
                return resetDelta;
            }
        });
        this.flushSample = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.MarginMapper
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                Class appendKey;
                appendKey = PrimaryWriter.appendKey();
                return appendKey;
            }
        });
        this.updateTimer = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.IndicatorActivator
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                Class locateSignal;
                locateSignal = PrimaryWriter.locateSignal();
                return locateSignal;
            }
        });
        this.applyTask = InternalPropagator.evictLayout(new ElevationNode() { // from class: com.goldenboot.saga.zone.ViewTracker
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                Class injectField;
                injectField = PrimaryWriter.injectField();
                return injectField;
            }
        });
    }

    public static final Class appendKey() {
        System.nanoTime();
        return Class.forName(StringDecryptor.decrypt(695857679287L) + StringDecryptor.decrypt(717248171510L) + StringDecryptor.decrypt(6910811096058L) + StringDecryptor.decrypt(6932201588281L) + StringDecryptor.decrypt(6957887047800L) + StringDecryptor.decrypt(6979277540023L) + StringDecryptor.decrypt(7000668032246L));
    }

    public static final void bindBody(PrimaryWriter primaryWriter, Object obj) {
        System.nanoTime();
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(primaryWriter.expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, StringDecryptor.decrypt(7235963446699L) + StringDecryptor.decrypt(7270238840810L)));
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
    }

    public static final void cancelArchive(PrimaryWriter primaryWriter, Object obj, String str) {
        System.nanoTime();
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(primaryWriter.expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, str));
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
    }

    public static final Class computeTarget() {
        System.nanoTime();
        return Class.forName(StringDecryptor.decrypt(5866297190371L) + StringDecryptor.decrypt(6735223502464L) + StringDecryptor.decrypt(6769498896575L) + StringDecryptor.decrypt(6799479323390L));
    }

    public static final /* synthetic */ boolean connectJob(PrimaryWriter primaryWriter, Object obj, Object obj2) {
        System.nanoTime();
        return primaryWriter.injectConstraint(obj, obj2);
    }

    public static final /* synthetic */ boolean connectPatch(PrimaryWriter primaryWriter, Object obj, String str) {
        System.nanoTime();
        return primaryWriter.parseAsset(obj, str);
    }

    public static final /* synthetic */ boolean drawField(PrimaryWriter primaryWriter, FrameLayout frameLayout, Message message) {
        System.nanoTime();
        return primaryWriter.flattenPackage(frameLayout, message);
    }

    public static final Class injectField() {
        System.nanoTime();
        return Class.forName(StringDecryptor.decrypt(6277180198418L) + StringDecryptor.decrypt(738638663733L) + StringDecryptor.decrypt(7129010985584L) + StringDecryptor.decrypt(7146106510511L) + StringDecryptor.decrypt(7167497002734L) + StringDecryptor.decrypt(7201772396845L) + StringDecryptor.decrypt(7227457856364L));
    }

    public static final Class locateSignal() {
        System.nanoTime();
        return Class.forName(StringDecryptor.decrypt(5866297190371L) + StringDecryptor.decrypt(7017763557173L) + StringDecryptor.decrypt(7043449016692L) + StringDecryptor.decrypt(7073429443507L) + StringDecryptor.decrypt(7094819935730L) + StringDecryptor.decrypt(7111915460657L) + StringDecryptor.decrypt(6525529203273L));
    }

    public static final void mapJob(PrimaryWriter primaryWriter, Object obj, String str) {
        System.nanoTime();
        primaryWriter.expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, str);
    }

    public static final /* synthetic */ void notifyMessage(PrimaryWriter primaryWriter, Object obj, int i, boolean z, String str) {
        System.nanoTime();
        primaryWriter.packPackage(obj, i, z, str);
    }

    public static final /* synthetic */ void peekRevision(PrimaryWriter primaryWriter, String str) {
        System.nanoTime();
        primaryWriter.filterPayload(str);
    }

    public static final /* synthetic */ void popBlueprint(PrimaryWriter primaryWriter, Object obj) {
        System.nanoTime();
        primaryWriter.syncScope(obj);
    }

    public static final /* synthetic */ void reduceScope(PrimaryWriter primaryWriter, int i) {
        System.nanoTime();
        primaryWriter.queryModel(i);
    }

    public static final Class resetDelta() {
        System.nanoTime();
        return Class.forName(StringDecryptor.decrypt(6277180198418L) + StringDecryptor.decrypt(6825164782909L) + StringDecryptor.decrypt(6850850242428L) + StringDecryptor.decrypt(6880830669243L) + StringDecryptor.decrypt(1937180982277L));
    }

    public static final /* synthetic */ void serializeOffset(PrimaryWriter primaryWriter) {
        System.nanoTime();
        primaryWriter.inflateEdge();
    }

    public static final void unlockMessage(PrimaryWriter primaryWriter, Object obj, String str) {
        System.nanoTime();
        primaryWriter.expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, StringDecryptor.decrypt(5100028372097L) + StringDecryptor.decrypt(5125713831616L));
        primaryWriter.expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, str);
    }

    public final void attachCallback() {
        System.nanoTime();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(3:2|3|(1:5)(1:24))|(3:7|(1:9)(1:22)|(6:11|12|13|14|15|16))|23|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f5, code lost:
    
        r1 = com.goldenboot.saga.zone.AttrSemaphore.notifyMessage;
        com.goldenboot.saga.zone.AttrSemaphore.growPayload(com.goldenboot.saga.zone.ColumnForger.evictLayout(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachConfig(Object obj) {
        View view;
        DpadBuilder dpadBuilder;
        System.nanoTime();
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            view = obj instanceof View ? (View) obj : null;
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
                dpadBuilder = DpadBuilder.evictLayout;
                AttrSemaphore.growPayload(dpadBuilder);
                expandArgs().getMethod(StringDecryptor.decrypt(5052952420355L) + StringDecryptor.decrypt(5078637879874L) + StringDecryptor.decrypt(4680639773715L), null).invoke(obj, null);
                expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, StringDecryptor.decrypt(5100028372097L) + StringDecryptor.decrypt(5125713831616L));
                expandArgs().getMethod(StringDecryptor.decrypt(5155694258431L) + StringDecryptor.decrypt(5181379717950L) + StringDecryptor.decrypt(5198475242877L), null).invoke(obj, null);
                AttrSemaphore.growPayload(expandArgs().getMethod(StringDecryptor.decrypt(5228455669692L), null).invoke(obj, null));
                this.growPayload.remove(obj);
            }
        }
        dpadBuilder = null;
        AttrSemaphore.growPayload(dpadBuilder);
        expandArgs().getMethod(StringDecryptor.decrypt(5052952420355L) + StringDecryptor.decrypt(5078637879874L) + StringDecryptor.decrypt(4680639773715L), null).invoke(obj, null);
        expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(obj, StringDecryptor.decrypt(5100028372097L) + StringDecryptor.decrypt(5125713831616L));
        expandArgs().getMethod(StringDecryptor.decrypt(5155694258431L) + StringDecryptor.decrypt(5181379717950L) + StringDecryptor.decrypt(5198475242877L), null).invoke(obj, null);
        AttrSemaphore.growPayload(expandArgs().getMethod(StringDecryptor.decrypt(5228455669692L), null).invoke(obj, null));
        this.growPayload.remove(obj);
    }

    public final void connectComponent() {
        System.nanoTime();
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            Object invoke = gatherAdapter().getMethod(StringDecryptor.decrypt(2532157174253L) + StringDecryptor.decrypt(2660500127591L), null).invoke(null, null);
            AttrSemaphore.growPayload(invoke != null ? gatherAdapter().getMethod(StringDecryptor.decrypt(2592033683626L), null).invoke(invoke, null) : null);
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
        Object handleFooter = CursorCollector.handleFooter(this.growPayload);
        if (handleFooter != null) {
            expandArgs().getMethod(StringDecryptor.decrypt(2686185587110L), null).invoke(handleFooter, null);
        }
    }

    public final Class decodePath() {
        System.nanoTime();
        return (Class) this.applyTask.getValue();
    }

    public final boolean dispatchTimezone(Uri uri) {
        String str;
        System.nanoTime();
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, StringDecryptor.decrypt(297859573128L) + StringDecryptor.decrypt(5528175593585L) + StringDecryptor.decrypt(5549566085808L));
        String scheme = uri.getScheme();
        if (scheme != null) {
            str = scheme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, StringDecryptor.decrypt(5566661610735L) + StringDecryptor.decrypt(5592347070254L) + StringDecryptor.decrypt(5618032529773L) + StringDecryptor.decrypt(5639423021996L));
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (HapticDecoder.flattenPackage(uri2, StringDecryptor.decrypt(5652223579627L) + StringDecryptor.decrypt(5686498973738L), true)) {
            return storeCharset(uri2);
        }
        if (str.length() <= 0 || Intrinsics.areEqual(str, StringDecryptor.decrypt(5703594498665L)) || Intrinsics.areEqual(str, StringDecryptor.decrypt(5724984990888L))) {
            return false;
        }
        try {
            try {
                this.evictLayout.startActivity(new Intent(StringDecryptor.decrypt(695857679287L) + StringDecryptor.decrypt(5750670450407L) + StringDecryptor.decrypt(5780650877222L) + StringDecryptor.decrypt(5806336336741L) + StringDecryptor.decrypt(5840611730852L), uri));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Activity activity = this.evictLayout;
            Intent intent = new Intent(StringDecryptor.decrypt(5866297190371L) + StringDecryptor.decrypt(5887687682594L) + StringDecryptor.decrypt(5904783207521L) + StringDecryptor.decrypt(5930468667040L) + StringDecryptor.decrypt(5951859159263L) + StringDecryptor.decrypt(5973249651486L), uri);
            intent.addCategory(StringDecryptor.decrypt(6003230078301L) + StringDecryptor.decrypt(6028915537820L) + StringDecryptor.decrypt(6046011062747L) + StringDecryptor.decrypt(6063106587674L) + StringDecryptor.decrypt(6093087014489L) + StringDecryptor.decrypt(6123067441304L) + StringDecryptor.decrypt(6148752900823L));
            activity.startActivity(intent);
        }
        return true;
    }

    public final int drawRequest(int i) {
        System.nanoTime();
        return (int) (i * this.evictLayout.getResources().getDisplayMetrics().density);
    }

    public final Class drawScope() {
        System.nanoTime();
        return (Class) this.flushSample.getValue();
    }

    public final Class expandArgs() {
        System.nanoTime();
        return (Class) this.releaseHeader.getValue();
    }

    public final void filterPayload(String str) {
        System.nanoTime();
        if (str == null || CachedPropagator.groupArchive(str) || HapticDecoder.storeCharset(str, StringDecryptor.decrypt(5262731063803L), false, 2, null) || HapticDecoder.storeCharset(str, StringDecryptor.decrypt(5292711490618L), false, 2, null)) {
            return;
        }
        this.peekRevision = true;
        this.reduceScope = false;
    }

    public final Class findTask() {
        System.nanoTime();
        return (Class) this.updateTimer.getValue();
    }

    public final boolean flattenPackage(FrameLayout frameLayout, Message message) {
        Object obj;
        System.nanoTime();
        Object newInstance = expandArgs().getConstructor(Context.class).newInstance(this.evictLayout);
        Intrinsics.checkNotNull(newInstance);
        prepareTask(newInstance, frameLayout);
        frameLayout.addView((View) newInstance);
        Class<?> cls = Class.forName(StringDecryptor.decrypt(5866297190371L) + StringDecryptor.decrypt(6542624728200L) + StringDecryptor.decrypt(6564015220423L) + StringDecryptor.decrypt(6589700679942L) + StringDecryptor.decrypt(6623976074053L) + StringDecryptor.decrypt(3820387740471L) + StringDecryptor.decrypt(6653956500868L) + StringDecryptor.decrypt(6671052025795L) + StringDecryptor.decrypt(6692442518018L));
        if (message == null || (obj = message.obj) == null || !cls.isInstance(obj)) {
            return false;
        }
        cls.getMethod(StringDecryptor.decrypt(3152734481491L) + StringDecryptor.decrypt(6705243075649L), expandArgs()).invoke(obj, newInstance);
        message.sendToTarget();
        return true;
    }

    public final void formatPosition() {
        System.nanoTime();
        try {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            Object invoke = gatherAdapter().getMethod(StringDecryptor.decrypt(2532157174253L) + StringDecryptor.decrypt(2562137601068L) + StringDecryptor.decrypt(2583528093291L), null).invoke(null, null);
            AttrSemaphore.growPayload(invoke != null ? gatherAdapter().getMethod(StringDecryptor.decrypt(2592033683626L), null).invoke(invoke, null) : null);
        } catch (Throwable th) {
            AttrSemaphore.ActivityMutator activityMutator2 = AttrSemaphore.notifyMessage;
            AttrSemaphore.growPayload(ColumnForger.evictLayout(th));
        }
        Object handleFooter = CursorCollector.handleFooter(this.growPayload);
        if (handleFooter != null) {
            expandArgs().getMethod(StringDecryptor.decrypt(2617719143145L) + StringDecryptor.decrypt(2634814668072L), null).invoke(handleFooter, null);
        }
    }

    public final Class gatherAdapter() {
        System.nanoTime();
        return (Class) this.clipOrigin.getValue();
    }

    public final boolean groupArchive() {
        final Object handleFooter;
        final String str;
        System.nanoTime();
        if (this.reduceScope || (handleFooter = CursorCollector.handleFooter(this.growPayload)) == null || (str = this.serializeOffset) == null) {
            return false;
        }
        this.reduceScope = true;
        ((View) handleFooter).post(new Runnable() { // from class: com.goldenboot.saga.zone.TileCheckpoint
            @Override // java.lang.Runnable
            public final void run() {
                PrimaryWriter.cancelArchive(PrimaryWriter.this, handleFooter, str);
            }
        });
        return true;
    }

    public final void inflateAdapter(Object obj) {
        System.nanoTime();
        updateAction(this.popBlueprint, obj);
        this.popBlueprint = null;
    }

    public final void inflateEdge() {
        System.nanoTime();
        this.notifyMessage = 0;
    }

    public final boolean injectConstraint(Object obj, Object obj2) {
        Method method;
        System.nanoTime();
        updateAction(this.popBlueprint, null);
        this.popBlueprint = obj;
        if (obj2 != null) {
            try {
                method = obj2.getClass().getMethod(StringDecryptor.decrypt(6478453251531L) + StringDecryptor.decrypt(6508433678346L) + StringDecryptor.decrypt(6525529203273L), null);
            } catch (Exception unused) {
                updateAction(this.popBlueprint, null);
                this.popBlueprint = null;
                return false;
            }
        } else {
            method = null;
        }
        Object invoke = method != null ? method.invoke(obj2, null) : null;
        Intent intent = invoke instanceof Intent ? (Intent) invoke : null;
        if (intent == null) {
            updateAction(this.popBlueprint, null);
            this.popBlueprint = null;
            return false;
        }
        ImageEvent imageEvent = this.drawField;
        if (imageEvent == null) {
            return true;
        }
        imageEvent.evictLayout(intent);
        return true;
    }

    public final boolean mergeLocale() {
        System.nanoTime();
        if (this.growPayload.isEmpty()) {
            return false;
        }
        Object emitStrategy = CursorCollector.emitStrategy(this.growPayload);
        if (this.growPayload.size() > 1) {
            attachConfig(emitStrategy);
            return true;
        }
        Object invoke = expandArgs().getMethod(StringDecryptor.decrypt(2322462875062L) + StringDecryptor.decrypt(2356738269173L), null).invoke(emitStrategy, null);
        Intrinsics.checkNotNull(invoke, StringDecryptor.decrypt(1522003006934L) + StringDecryptor.decrypt(2369538826804L) + StringDecryptor.decrypt(1196597623522L) + StringDecryptor.decrypt(1226578050337L) + StringDecryptor.decrypt(2390929319027L) + StringDecryptor.decrypt(1667525829456L) + StringDecryptor.decrypt(2416614778546L) + StringDecryptor.decrypt(2433710303473L) + StringDecryptor.decrypt(2450805828400L) + StringDecryptor.decrypt(2480786255215L));
        if (!((Boolean) invoke).booleanValue()) {
            return false;
        }
        expandArgs().getMethod(StringDecryptor.decrypt(2502176747438L), null).invoke(emitStrategy, null);
        return true;
    }

    public final void packPackage(final Object obj, int i, boolean z, final String str) {
        System.nanoTime();
        if (z) {
            if (i == -9 && obj != null && str != null) {
                ((View) obj).post(new Runnable() { // from class: com.goldenboot.saga.zone.TabEmitter
                    @Override // java.lang.Runnable
                    public final void run() {
                        PrimaryWriter.unlockMessage(PrimaryWriter.this, obj, str);
                    }
                });
                return;
            }
            if (!this.peekRevision && CursorBuilder.notifyMessage(-2, -6, -7, -8, -11).contains(Integer.valueOf(i))) {
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    view.post(new Runnable() { // from class: com.goldenboot.saga.zone.SetupMutator
                        @Override // java.lang.Runnable
                        public final void run() {
                            PrimaryWriter.bindBody(PrimaryWriter.this, obj);
                        }
                    });
                }
                ElevationNode elevationNode = this.connectJob;
                if (elevationNode != null) {
                    elevationNode.invoke();
                }
            }
        }
    }

    public final boolean parseAsset(final Object obj, final String str) {
        System.nanoTime();
        int i = this.notifyMessage + 1;
        this.notifyMessage = i;
        if (i < 20) {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, StringDecryptor.decrypt(5476804674547L) + StringDecryptor.decrypt(5506785101362L));
            return dispatchTimezone(parse);
        }
        this.notifyMessage = 0;
        Intrinsics.checkNotNull(obj, StringDecryptor.decrypt(3311057861644L) + StringDecryptor.decrypt(5318396950137L) + StringDecryptor.decrypt(1196597623522L) + StringDecryptor.decrypt(5335492475064L) + StringDecryptor.decrypt(1637545402641L) + StringDecryptor.decrypt(5365472901879L) + StringDecryptor.decrypt(5395453328694L) + StringDecryptor.decrypt(5412548853621L) + StringDecryptor.decrypt(5442529280436L) + StringDecryptor.decrypt(3820387740471L));
        ((View) obj).post(new Runnable() { // from class: com.goldenboot.saga.zone.PanelDownloader
            @Override // java.lang.Runnable
            public final void run() {
                PrimaryWriter.mapJob(PrimaryWriter.this, obj, str);
            }
        });
        return true;
    }

    public final void prepareTask(Object obj, FrameLayout frameLayout) {
        System.nanoTime();
        Object invoke = gatherAdapter().getMethod(StringDecryptor.decrypt(1004083193515L) + StringDecryptor.decrypt(2895964230558L) + StringDecryptor.decrypt(2921649690077L), null).invoke(null, null);
        Class gatherAdapter = gatherAdapter();
        String str = StringDecryptor.decrypt(2938745215004L) + StringDecryptor.decrypt(2964430674523L) + StringDecryptor.decrypt(2998706068634L) + StringDecryptor.decrypt(3032981462745L) + StringDecryptor.decrypt(3050076987672L);
        Class expandArgs = expandArgs();
        Class cls = Boolean.TYPE;
        Method method = gatherAdapter.getMethod(str, expandArgs, cls);
        Boolean bool = Boolean.TRUE;
        method.invoke(invoke, obj, bool);
        gatherAdapter().getMethod(StringDecryptor.decrypt(3071467479895L) + StringDecryptor.decrypt(3088563004822L) + StringDecryptor.decrypt(3105658529749L) + StringDecryptor.decrypt(3127049021972L), cls).invoke(invoke, bool);
        expandArgs().getMethod(StringDecryptor.decrypt(3152734481491L) + StringDecryptor.decrypt(3174124973714L) + StringDecryptor.decrypt(3204105400529L) + StringDecryptor.decrypt(3225495892752L), decodePath()).invoke(obj, new ActivityMutator(this, frameLayout));
        expandArgs().getMethod(StringDecryptor.decrypt(3251181352271L) + StringDecryptor.decrypt(3276866811790L) + StringDecryptor.decrypt(3293962336717L) + StringDecryptor.decrypt(3225495892752L), findTask()).invoke(obj, new BounceHandler(this, this.evictLayout));
        Intrinsics.checkNotNull(obj, StringDecryptor.decrypt(3311057861644L) + StringDecryptor.decrypt(3345333255755L) + StringDecryptor.decrypt(3371018715274L) + StringDecryptor.decrypt(3396704174793L) + StringDecryptor.decrypt(1260853444448L) + StringDecryptor.decrypt(1295128838559L) + StringDecryptor.decrypt(695857679287L) + StringDecryptor.decrypt(3426684601608L) + StringDecryptor.decrypt(3443780126535L) + StringDecryptor.decrypt(3469465586054L) + StringDecryptor.decrypt(3495151045573L));
        ((View) obj).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Class expandArgs2 = expandArgs();
        StringBuilder sb = new StringBuilder(StringDecryptor.decrypt(3503656635908L));
        sb.append(StringDecryptor.decrypt(3537932030019L));
        Object invoke2 = expandArgs2.getMethod(sb.toString(), null).invoke(obj, null);
        Class drawScope = drawScope();
        StringBuilder sb2 = new StringBuilder(StringDecryptor.decrypt(3559322522242L));
        sb2.append(StringDecryptor.decrypt(3593597916353L));
        sb2.append(StringDecryptor.decrypt(3619283375872L));
        sb2.append(StringDecryptor.decrypt(3640673868095L));
        drawScope.getMethod(sb2.toString(), cls).invoke(invoke2, bool);
        drawScope().getMethod(StringDecryptor.decrypt(3071467479895L) + StringDecryptor.decrypt(3662064360318L) + StringDecryptor.decrypt(3692044787133L) + StringDecryptor.decrypt(3709140312060L) + StringDecryptor.decrypt(3726235836987L) + StringDecryptor.decrypt(3751921296506L), cls).invoke(invoke2, bool);
        Class drawScope2 = drawScope();
        StringBuilder sb3 = new StringBuilder(StringDecryptor.decrypt(3769016821433L));
        sb3.append(StringDecryptor.decrypt(3794702280952L));
        sb3.append(StringDecryptor.decrypt(3820387740471L));
        sb3.append(StringDecryptor.decrypt(3841778232694L));
        drawScope2.getMethod(sb3.toString(), cls).invoke(invoke2, bool);
        drawScope().getMethod(StringDecryptor.decrypt(3863168724917L) + StringDecryptor.decrypt(3897444119028L) + StringDecryptor.decrypt(3927424545843L), cls).invoke(invoke2, bool);
        drawScope().getMethod(StringDecryptor.decrypt(3961699939954L) + StringDecryptor.decrypt(3987385399473L) + StringDecryptor.decrypt(4017365826288L) + StringDecryptor.decrypt(4038756318511L), Integer.TYPE).invoke(invoke2, 0);
        Method method2 = drawScope().getMethod(StringDecryptor.decrypt(4060146810734L) + StringDecryptor.decrypt(4094422204845L) + StringDecryptor.decrypt(4111517729772L) + StringDecryptor.decrypt(4132908221995L) + StringDecryptor.decrypt(4167183616106L) + StringDecryptor.decrypt(4201459010217L) + StringDecryptor.decrypt(4222849502440L), cls);
        Boolean bool2 = Boolean.FALSE;
        method2.invoke(invoke2, bool2);
        drawScope().getMethod(StringDecryptor.decrypt(4239945027367L) + StringDecryptor.decrypt(4261335519590L) + StringDecryptor.decrypt(4287020979109L) + StringDecryptor.decrypt(4312706438628L) + StringDecryptor.decrypt(4338391898147L), cls).invoke(invoke2, bool2);
        drawScope().getMethod(StringDecryptor.decrypt(4355487423074L) + StringDecryptor.decrypt(4385467849889L) + StringDecryptor.decrypt(4402563374816L) + StringDecryptor.decrypt(4419658899743L) + StringDecryptor.decrypt(4445344359262L) + StringDecryptor.decrypt(4471029818781L), cls).invoke(invoke2, bool2);
        drawScope().getMethod(StringDecryptor.decrypt(3071467479895L) + StringDecryptor.decrypt(4479535409116L) + StringDecryptor.decrypt(4496630934043L) + StringDecryptor.decrypt(4522316393562L) + StringDecryptor.decrypt(4539411918489L) + StringDecryptor.decrypt(4565097378008L) + StringDecryptor.decrypt(4582192902935L), cls).invoke(invoke2, bool);
        Class drawScope3 = drawScope();
        StringBuilder sb4 = new StringBuilder(StringDecryptor.decrypt(4599288427862L));
        sb4.append(StringDecryptor.decrypt(4629268854677L));
        sb4.append(StringDecryptor.decrypt(4659249281492L));
        sb4.append(StringDecryptor.decrypt(4680639773715L));
        Object invoke3 = drawScope3.getMethod(sb4.toString(), null).invoke(invoke2, null);
        Intrinsics.checkNotNull(invoke3, StringDecryptor.decrypt(1145226704484L) + StringDecryptor.decrypt(4693440331346L) + StringDecryptor.decrypt(4727715725457L) + StringDecryptor.decrypt(3396704174793L) + StringDecryptor.decrypt(1260853444448L) + StringDecryptor.decrypt(4757696152272L) + StringDecryptor.decrypt(4783381611791L) + StringDecryptor.decrypt(4804772104014L) + StringDecryptor.decrypt(4821867628941L) + StringDecryptor.decrypt(1038274243369L));
        String expandArgs3 = HapticDecoder.expandArgs((String) invoke3, StringDecryptor.decrypt(4847553088460L), "", false, 4, null);
        StringBuilder sb5 = new StringBuilder(StringDecryptor.decrypt(4868943580683L));
        sb5.append(StringDecryptor.decrypt(4898924007498L));
        sb5.append(StringDecryptor.decrypt(4924609467017L));
        sb5.append(StringDecryptor.decrypt(4950294926536L));
        String obj2 = CachedPropagator.appendEvent(new BorderGovernor(StringDecryptor.decrypt(4958800516871L)).evictLayout(new BorderGovernor(sb5.toString()).evictLayout(expandArgs3, ""), " ")).toString();
        drawScope().getMethod(StringDecryptor.decrypt(4975896041798L) + StringDecryptor.decrypt(5010171435909L) + StringDecryptor.decrypt(5031561928132L) + StringDecryptor.decrypt(1038274243369L), String.class).invoke(invoke2, obj2);
        if (this.growPayload.contains(obj)) {
            return;
        }
        this.growPayload.add(obj);
    }

    public final void purgeNode() {
        System.nanoTime();
        Iterator it = CursorCollector.appendEvent(this.growPayload).iterator();
        while (it.hasNext()) {
            attachConfig(it.next());
        }
        this.growPayload.clear();
    }

    public final void queryModel(int i) {
        System.nanoTime();
    }

    public final void resetValue(ElevationNode elevationNode) {
        System.nanoTime();
        this.connectJob = elevationNode;
    }

    public final void resolveDelta(ImageEvent imageEvent) {
        System.nanoTime();
        this.drawField = imageEvent;
    }

    public final void resumeSignature(Bundle bundle) {
        System.nanoTime();
        Intrinsics.checkNotNullParameter(bundle, StringDecryptor.decrypt(2720460981221L) + StringDecryptor.decrypt(2750441408036L));
        Object handleFooter = CursorCollector.handleFooter(this.growPayload);
        if (handleFooter != null) {
            expandArgs().getMethod(StringDecryptor.decrypt(2763241965667L) + StringDecryptor.decrypt(2788927425186L), Bundle.class).invoke(handleFooter, bundle);
        }
    }

    public final void serializeTask(FrameLayout frameLayout, String str) {
        System.nanoTime();
        Intrinsics.checkNotNullParameter(frameLayout, StringDecryptor.decrypt(2253912086840L) + StringDecryptor.decrypt(41004977938L));
        Intrinsics.checkNotNullParameter(str, StringDecryptor.decrypt(606000743099L));
        this.injectMetric = frameLayout;
        frameLayout.setVisibility(0);
        frameLayout.setBackgroundColor(-16777216);
        ProgressBar progressBar = new ProgressBar(this.evictLayout);
        progressBar.setIndeterminate(true);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(drawRequest(48), drawRequest(48), 17));
        this.detachStream = progressBar;
        frameLayout.addView(progressBar);
        Object newInstance = expandArgs().getConstructor(Context.class).newInstance(this.evictLayout);
        Intrinsics.checkNotNull(newInstance);
        prepareTask(newInstance, frameLayout);
        View view = (View) newInstance;
        frameLayout.addView(view, 0);
        this.serializeOffset = str;
        this.reduceScope = false;
        expandArgs().getMethod(StringDecryptor.decrypt(2288187480951L), String.class).invoke(newInstance, str);
        view.setVisibility(0);
        ProgressBar progressBar2 = this.detachStream;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
    }

    public final void startResource(Bundle bundle) {
        System.nanoTime();
        Intrinsics.checkNotNullParameter(bundle, StringDecryptor.decrypt(640191792953L) + StringDecryptor.decrypt(2810317917409L));
        Object handleFooter = CursorCollector.handleFooter(this.growPayload);
        if (handleFooter != null) {
            expandArgs().getMethod(StringDecryptor.decrypt(2836003376928L) + StringDecryptor.decrypt(2865983803743L), Bundle.class).invoke(handleFooter, bundle);
        }
    }

    public final boolean storeCharset(String str) {
        System.nanoTime();
        try {
            try {
                this.evictLayout.startActivity(Intent.parseUri(str, 1));
            } catch (Exception unused) {
            }
        } catch (ActivityNotFoundException unused2) {
            String stringExtra = Intent.parseUri(str, 1).getStringExtra(StringDecryptor.decrypt(6174438360342L) + StringDecryptor.decrypt(6208713754453L) + StringDecryptor.decrypt(6225809279380L) + StringDecryptor.decrypt(6247199771603L));
            if (stringExtra != null && stringExtra.length() != 0) {
                this.evictLayout.startActivity(new Intent(StringDecryptor.decrypt(6277180198418L) + StringDecryptor.decrypt(6311455592529L) + StringDecryptor.decrypt(6345730986640L) + StringDecryptor.decrypt(6371416446159L), Uri.parse(stringExtra)));
            }
        }
        return true;
    }

    public final void syncScope(Object obj) {
        System.nanoTime();
        if (this.growPayload.size() > 1) {
            attachConfig(obj);
        }
    }

    public final void updateAction(Object obj, Object obj2) {
        System.nanoTime();
        if (obj == null) {
            return;
        }
        try {
            obj.getClass().getMethod(StringDecryptor.decrypt(6405691840270L) + StringDecryptor.decrypt(6435672267085L) + StringDecryptor.decrypt(6461357726604L), Object.class).invoke(obj, obj2);
        } catch (Exception unused) {
        }
    }
}
