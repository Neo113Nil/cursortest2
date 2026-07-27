package com.onesignal.common.consistency;

import com.onesignal.common.consistency.enums.IamFetchRywTokenKey;
import com.onesignal.common.consistency.models.ICondition;
import com.onesignal.common.consistency.models.IConsistencyKeyEnum;
import g4.AbstractC0464i;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IamFetchReadyCondition implements ICondition {
    public static final Companion Companion = new Companion(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public IamFetchReadyCondition(String key) {
        i.e(key, "key");
        this.key = key;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public String getId() {
        return ID;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public RywData getRywData(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> indexedTokens) {
        i.e(indexedTokens, "indexedTokens");
        Map<IConsistencyKeyEnum, RywData> map = indexedTokens.get(this.key);
        Object obj = null;
        if (map == null) {
            return null;
        }
        Iterator it = AbstractC0464i.T(new RywData[]{map.get(IamFetchRywTokenKey.USER), map.get(IamFetchRywTokenKey.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                String rywToken = ((RywData) obj).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next = it.next();
                    String rywToken2 = ((RywData) next).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        obj = next;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (RywData) obj;
    }

    @Override // com.onesignal.common.consistency.models.ICondition
    public boolean isMet(Map<String, ? extends Map<IConsistencyKeyEnum, RywData>> indexedTokens) {
        i.e(indexedTokens, "indexedTokens");
        Map<IConsistencyKeyEnum, RywData> map = indexedTokens.get(this.key);
        return (map == null || map.get(IamFetchRywTokenKey.USER) == null) ? false : true;
    }
}
