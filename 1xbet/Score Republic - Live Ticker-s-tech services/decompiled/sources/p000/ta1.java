package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 extends sj0 {

    /* JADX INFO: renamed from: n */
    public static final UriMatcher f7396n;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f7396n = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // p000.InterfaceC0551oo
    /* JADX INFO: renamed from: a */
    public final Class mo1071a() {
        return InputStream.class;
    }

    @Override // p000.sj0
    /* JADX INFO: renamed from: b */
    public final void mo1994b(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    @Override // p000.sj0
    /* JADX INFO: renamed from: c */
    public final Object mo1995c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        Uri uriLookupContact;
        InputStream inputStreamOpenContactPhotoInputStream;
        int iMatch = f7396n.match(uri);
        if (iMatch == 1) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (iMatch == 3) {
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else if (iMatch == 5) {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
            if (uriLookupContact != null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        } else if (this.f7128j && AbstractC0565p1.m3837g(uri) && AbstractC0565p1.m3836f()) {
            AssetFileDescriptor assetFileDescriptorM3838h = AbstractC0565p1.m3838h(uri, contentResolver);
            if (assetFileDescriptorM3838h == null) {
                dd0.m1168n(uri, "FileDescriptor is null for: ");
                return null;
            }
            try {
                inputStreamOpenContactPhotoInputStream = assetFileDescriptorM3838h.createInputStream();
            } catch (IOException e) {
                try {
                    assetFileDescriptorM3838h.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
            }
        } else {
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uri);
        }
        if (inputStreamOpenContactPhotoInputStream != null) {
            return inputStreamOpenContactPhotoInputStream;
        }
        dd0.m1168n(uri, "InputStream is null for ");
        return null;
    }
}
