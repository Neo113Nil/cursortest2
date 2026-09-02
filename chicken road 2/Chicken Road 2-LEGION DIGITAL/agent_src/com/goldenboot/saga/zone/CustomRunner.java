package com.goldenboot.saga.zone;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.goldenboot.saga.zone.DpadNotifier;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@DpadNotifier.BounceHandler("activity")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/goldenboot/saga/zone/CustomRunner;", "Lcom/goldenboot/saga/zone/DpadNotifier;", "Lcom/goldenboot/saga/zone/CustomRunner$BounceHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "connectJob", "()Lcom/goldenboot/saga/zone/CustomRunner$BounceHandler;", "", "drawField", "()Z", "destination", "Landroid/os/Bundle;", "args", "Lcom/goldenboot/saga/zone/ColorStore;", "navOptions", "Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;", "navigatorExtras", "Lcom/goldenboot/saga/zone/ListSwitch;", "peekRevision", "(Lcom/goldenboot/saga/zone/CustomRunner$BounceHandler;Landroid/os/Bundle;Lcom/goldenboot/saga/zone/ColorStore;Lcom/goldenboot/saga/zone/DpadNotifier$ActivityMutator;)Lcom/goldenboot/saga/zone/ListSwitch;", "injectMetric", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/app/Activity;", "detachStream", "Landroid/app/Activity;", "hostActivity", "releaseHeader", "ActivityMutator", "BounceHandler", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class CustomRunner extends DpadNotifier {

    /* renamed from: detachStream, reason: from kotlin metadata */
    public final Activity hostActivity;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    public final Context context;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class BounceHandler extends ListSwitch {
        public Intent findTask;
        public String mergeLocale;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BounceHandler(DpadNotifier activityNavigator) {
            super(activityNavigator);
            Intrinsics.checkNotNullParameter(activityNavigator, "activityNavigator");
        }

        public final ComponentName attachCallback() {
            Intent intent = this.findTask;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @Override // com.goldenboot.saga.zone.ListSwitch
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof BounceHandler) && super.equals(obj)) {
                Intent intent = this.findTask;
                if ((intent != null ? intent.filterEquals(((BounceHandler) obj).findTask) : ((BounceHandler) obj).findTask == null) && Intrinsics.areEqual(this.mergeLocale, ((BounceHandler) obj).mergeLocale)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.goldenboot.saga.zone.ListSwitch
        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            Intent intent = this.findTask;
            int filterHashCode = (hashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.mergeLocale;
            return filterHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String mapJob() {
            Intent intent = this.findTask;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @Override // com.goldenboot.saga.zone.ListSwitch
        public boolean parseAsset() {
            return false;
        }

        public final String prepareTask() {
            return this.mergeLocale;
        }

        @Override // com.goldenboot.saga.zone.ListSwitch
        public String toString() {
            ComponentName attachCallback = attachCallback();
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (attachCallback != null) {
                sb.append(" class=");
                sb.append(attachCallback.getClassName());
            } else {
                String mapJob = mapJob();
                if (mapJob != null) {
                    sb.append(" action=");
                    sb.append(mapJob);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            return sb2;
        }

        public final Intent updateAction() {
            return this.findTask;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements TouchRecord {
        public static final FeedbackFlow reduceScope = new FeedbackFlow();

        public FeedbackFlow() {
            super(1);
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public CustomRunner(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Iterator it = PaddingStage.applyTask(context, FeedbackFlow.reduceScope).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.hostActivity = (Activity) obj;
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    /* renamed from: connectJob, reason: merged with bridge method [inline-methods] */
    public BounceHandler evictLayout() {
        return new BounceHandler(this);
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    public boolean drawField() {
        Activity activity = this.hostActivity;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // com.goldenboot.saga.zone.DpadNotifier
    /* renamed from: peekRevision, reason: merged with bridge method [inline-methods] */
    public ListSwitch detachStream(BounceHandler destination, Bundle args, ColorStore navOptions, DpadNotifier.ActivityMutator navigatorExtras) {
        Intent intent;
        int intExtra;
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination.updateAction() == null) {
            throw new IllegalStateException(("Destination " + destination.findTask() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.updateAction());
        if (args != null) {
            intent2.putExtras(args);
            String prepareTask = destination.prepareTask();
            if (prepareTask != null && prepareTask.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(prepareTask);
                while (matcher.find()) {
                    String group = matcher.group(1);
                    if (!args.containsKey(group)) {
                        throw new IllegalArgumentException("Could not find " + group + " in " + args + " to fill data pattern " + prepareTask);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(args.get(group))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        if (this.hostActivity == null) {
            intent2.addFlags(268435456);
        }
        if (navOptions != null && navOptions.popBlueprint()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.hostActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", destination.findTask());
        Resources resources = this.context.getResources();
        if (navOptions != null) {
            int injectMetric = navOptions.injectMetric();
            int detachStream = navOptions.detachStream();
            if ((injectMetric <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(injectMetric), "animator")) && (detachStream <= 0 || !Intrinsics.areEqual(resources.getResourceTypeName(detachStream), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", injectMetric);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", detachStream);
            } else {
                resources.getResourceName(injectMetric);
                resources.getResourceName(detachStream);
                destination.toString();
            }
        }
        this.context.startActivity(intent2);
        if (navOptions == null || this.hostActivity == null) {
            return null;
        }
        int evictLayout = navOptions.evictLayout();
        int growPayload = navOptions.growPayload();
        if ((evictLayout > 0 && Intrinsics.areEqual(resources.getResourceTypeName(evictLayout), "animator")) || (growPayload > 0 && Intrinsics.areEqual(resources.getResourceTypeName(growPayload), "animator"))) {
            resources.getResourceName(evictLayout);
            resources.getResourceName(growPayload);
            destination.toString();
            return null;
        }
        if (evictLayout < 0 && growPayload < 0) {
            return null;
        }
        this.hostActivity.overridePendingTransition(CellEntry.releaseHeader(evictLayout, 0), CellEntry.releaseHeader(growPayload, 0));
        return null;
    }
}
