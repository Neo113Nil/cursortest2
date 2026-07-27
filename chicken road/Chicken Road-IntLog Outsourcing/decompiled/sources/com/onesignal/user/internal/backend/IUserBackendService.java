package com.onesignal.user.internal.backend;

import java.util.List;
import java.util.Map;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IUserBackendService {

    public static final class DefaultImpls {
        public static /* synthetic */ Object createUser$default(IUserBackendService iUserBackendService, String str, Map map, List list, Map map2, String str2, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createUser");
            }
            if ((i2 & 16) != 0) {
                str2 = null;
            }
            return iUserBackendService.createUser(str, map, list, map2, str2, interfaceC1218d);
        }

        public static /* synthetic */ Object getUser$default(IUserBackendService iUserBackendService, String str, String str2, String str3, String str4, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUser");
            }
            if ((i2 & 8) != 0) {
                str4 = null;
            }
            return iUserBackendService.getUser(str, str2, str3, str4, interfaceC1218d);
        }

        public static /* synthetic */ Object updateUser$default(IUserBackendService iUserBackendService, String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, String str4, InterfaceC1218d interfaceC1218d, int i2, Object obj) {
            if (obj == null) {
                return iUserBackendService.updateUser(str, str2, str3, propertiesObject, z, propertiesDeltasObject, (i2 & 64) != 0 ? null : str4, interfaceC1218d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateUser");
        }
    }

    Object createUser(String str, Map<String, String> map, List<SubscriptionObject> list, Map<String, String> map2, String str2, InterfaceC1218d interfaceC1218d);

    Object getUser(String str, String str2, String str3, String str4, InterfaceC1218d interfaceC1218d);

    Object updateUser(String str, String str2, String str3, PropertiesObject propertiesObject, boolean z, PropertiesDeltasObject propertiesDeltasObject, String str4, InterfaceC1218d interfaceC1218d);
}
