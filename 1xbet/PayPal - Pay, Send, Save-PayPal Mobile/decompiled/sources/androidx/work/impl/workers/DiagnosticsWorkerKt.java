package androidx.work.impl.workers;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lorg/jspecify/annotations/NonNull;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiagnosticsWorkerKt {
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("DiagnosticsWrkr");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighResolutionOutputSizeshNQ4ISI = tagWithPrefix;
    }

    public static final /* synthetic */ java.lang.String access$workSpecRows(androidx.work.impl.model.WorkNameDao workNameDao, androidx.work.impl.model.WorkTagDao workTagDao, androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao, java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.work.impl.model.WorkSpec workSpec = (androidx.work.impl.model.WorkSpec) it.next();
            androidx.work.impl.model.SystemIdInfo systemIdInfo = systemIdInfoDao.getSystemIdInfo(androidx.work.impl.model.WorkSpecKt.generationalId(workSpec));
            java.lang.Integer valueOf = systemIdInfo != null ? java.lang.Integer.valueOf(systemIdInfo.systemId) : null;
            java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(workNameDao.getNamesForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null);
            java.lang.String joinToString$default2 = kotlin.collections.CollectionsKt.joinToString$default(workTagDao.getTagsForWorkSpecId(workSpec.id), ",", null, null, 0, null, null, 62, null);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            sb2.append(workSpec.id);
            sb2.append("\t ");
            sb2.append(workSpec.workerClassName);
            sb2.append("\t ");
            sb2.append(valueOf);
            sb2.append("\t ");
            sb2.append(workSpec.state.name());
            sb2.append("\t ");
            sb2.append(joinToString$default);
            sb2.append("\t ");
            sb2.append(joinToString$default2);
            sb2.append('\t');
            sb.append(sb2.toString());
        }
        return sb.toString();
    }
}
