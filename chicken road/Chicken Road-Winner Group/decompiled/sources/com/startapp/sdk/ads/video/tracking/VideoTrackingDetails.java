package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.bj;
import com.startapp.sdk.internal.ti;
import com.startapp.sdk.internal.ui;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class VideoTrackingDetails implements Serializable {
    private static final long serialVersionUID = -1841622077369870410L;

    @TypeInfo(type = AbsoluteTrackingLink.class)
    private AbsoluteTrackingLink[] absoluteTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] creativeViewUrls;

    @TypeInfo(type = FractionTrackingLink.class)
    private FractionTrackingLink[] fractionTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] impressionUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] inlineErrorTrackingUrls;
    private boolean isVAST;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundMuteUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] soundUnmuteUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClickTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoClosedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPausedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClickTrackingUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollClosedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoPostRollImpressionUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoResumedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoRewardedUrls;

    @TypeInfo(type = ActionTrackingLink.class)
    private ActionTrackingLink[] videoSkippedUrls;

    public VideoTrackingDetails() {
    }

    public final AbsoluteTrackingLink[] a() {
        return this.absoluteTrackingUrls;
    }

    public final ActionTrackingLink[] b() {
        return this.creativeViewUrls;
    }

    public final FractionTrackingLink[] c() {
        return this.fractionTrackingUrls;
    }

    public final ActionTrackingLink[] d() {
        return this.impressionUrls;
    }

    public final ActionTrackingLink[] e() {
        return this.inlineErrorTrackingUrls;
    }

    public final ActionTrackingLink[] f() {
        return this.soundMuteUrls;
    }

    public final ActionTrackingLink[] g() {
        return this.soundUnmuteUrls;
    }

    public final ActionTrackingLink[] h() {
        return this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] i() {
        return this.videoClosedUrls;
    }

    public final ActionTrackingLink[] j() {
        return this.videoPausedUrls;
    }

    public final ActionTrackingLink[] k() {
        return this.isVAST ? this.videoPostRollClickTrackingUrls : this.videoClickTrackingUrls;
    }

    public final ActionTrackingLink[] l() {
        return this.videoPostRollClosedUrls;
    }

    public final ActionTrackingLink[] m() {
        return this.videoPostRollImpressionUrls;
    }

    public final ActionTrackingLink[] n() {
        return this.videoResumedUrls;
    }

    public final ActionTrackingLink[] o() {
        return this.videoRewardedUrls;
    }

    public final ActionTrackingLink[] p() {
        return this.videoSkippedUrls;
    }

    public VideoTrackingDetails(ui uiVar) {
        AbsoluteTrackingLink[] absoluteTrackingLinkArr;
        this.isVAST = true;
        this.impressionUrls = a(uiVar.f4478b);
        this.soundMuteUrls = a(uiVar.f4484i);
        this.soundUnmuteUrls = a(uiVar.f4485j);
        this.videoPausedUrls = a(uiVar.f4481e);
        this.videoResumedUrls = a(uiVar.f);
        this.videoSkippedUrls = a(uiVar.f4486k);
        this.videoClosedUrls = a(uiVar.f4483h);
        this.inlineErrorTrackingUrls = a(uiVar.f4477a);
        this.videoClickTrackingUrls = a(uiVar.f4487l);
        ArrayList arrayList = uiVar.f4479c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bj bjVar = (bj) it.next();
                AbsoluteTrackingLink absoluteTrackingLink = new AbsoluteTrackingLink();
                absoluteTrackingLink.a(bjVar.f3510a);
                if (((Integer) bjVar.f3511b).intValue() != -1) {
                    absoluteTrackingLink.a(((Integer) bjVar.f3511b).intValue());
                }
                absoluteTrackingLink.d();
                absoluteTrackingLink.e();
                arrayList2.add(absoluteTrackingLink);
            }
            absoluteTrackingLinkArr = (AbsoluteTrackingLink[]) arrayList2.toArray(new AbsoluteTrackingLink[0]);
        } else {
            absoluteTrackingLinkArr = new AbsoluteTrackingLink[0];
        }
        this.absoluteTrackingUrls = absoluteTrackingLinkArr;
        ArrayList<bj> arrayList3 = uiVar.f4480d;
        ArrayList arrayList4 = uiVar.f4482g;
        ArrayList arrayList5 = new ArrayList(arrayList3.size());
        for (bj bjVar2 : arrayList3) {
            FractionTrackingLink fractionTrackingLink = new FractionTrackingLink();
            fractionTrackingLink.a(bjVar2.f3510a);
            fractionTrackingLink.a((int) (((Float) bjVar2.f3511b).floatValue() * 100.0f));
            fractionTrackingLink.d();
            fractionTrackingLink.e();
            arrayList5.add(fractionTrackingLink);
        }
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            FractionTrackingLink fractionTrackingLink2 = new FractionTrackingLink();
            fractionTrackingLink2.a(str);
            fractionTrackingLink2.a(100);
            fractionTrackingLink2.d();
            fractionTrackingLink2.e();
            arrayList5.add(fractionTrackingLink2);
        }
        this.fractionTrackingUrls = arrayList5.size() > 0 ? (FractionTrackingLink[]) arrayList5.toArray(new FractionTrackingLink[0]) : new FractionTrackingLink[0];
        List list = uiVar.f4490o;
        if (list == null || list.isEmpty()) {
            return;
        }
        this.videoPostRollImpressionUrls = a(((ti) list.get(0)).f);
        this.videoPostRollClickTrackingUrls = a(((ti) list.get(0)).f4398e);
    }

    public static ActionTrackingLink[] a(List list) {
        if (list == null) {
            return new ActionTrackingLink[0];
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ActionTrackingLink actionTrackingLink = new ActionTrackingLink();
            actionTrackingLink.a(str);
            actionTrackingLink.d();
            actionTrackingLink.e();
            arrayList.add(actionTrackingLink);
        }
        return (ActionTrackingLink[]) arrayList.toArray(new ActionTrackingLink[0]);
    }
}
