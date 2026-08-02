package com.google.firebase.database;

/* loaded from: classes.dex */
final class zzp implements ValueEventListener {
    private final /* synthetic */ ValueEventListener zzav;
    private final /* synthetic */ Query zzaw;

    zzp(Query query, ValueEventListener valueEventListener) {
        this.zzaw = query;
        this.zzav = valueEventListener;
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onCancelled(DatabaseError databaseError) {
        this.zzav.onCancelled(databaseError);
    }

    @Override // com.google.firebase.database.ValueEventListener
    public final void onDataChange(DataSnapshot dataSnapshot) {
        this.zzaw.removeEventListener(this);
        this.zzav.onDataChange(dataSnapshot);
    }
}
